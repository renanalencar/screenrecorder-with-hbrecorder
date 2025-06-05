package br.com.renanalencar.screenrecorder

import android.content.Intent
import android.media.projection.MediaProjectionManager
import android.os.Bundle
import android.os.Environment
import android.os.StatFs
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import br.com.renanalencar.screenrecorder.ui.theme.ScreenRecorderTheme
import com.hbisoft.hbrecorder.HBRecorder
import com.hbisoft.hbrecorder.HBRecorderListener
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainActivity :
    ComponentActivity(),
    HBRecorderListener {
    private lateinit var hbRecorder: HBRecorder
    private val viewModel: ScreenRecorderViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hbRecorder = HBRecorder(this, this)

        setContent {
            ScreenRecorderTheme {
                ScreenRecorderUI(
                    viewModel = viewModel,
                    onClickFunction = { onClickToggleRecording() },
                )
            }
        }
    }

    private fun onClickToggleRecording() {
        if (viewModel.isRecording.value) {
            stopRecording()
        } else {
            startRecording()
        }
    }

    private fun startRecording() {
        // The MEDIA_PROJECTION_SERVICE is already built into Android.
        val mediaProjectionManager: MediaProjectionManager =
            getSystemService(MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
        val screenCaptureIntent: Intent = mediaProjectionManager.createScreenCaptureIntent()
        startRecordingLauncher.launch(screenCaptureIntent)
    }

    // Start recording if the user has granted permission
    private var startRecordingLauncher =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult(),
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val data: Intent? = result.data

                hbRecorder.isAudioEnabled(viewModel.audioEnabled.value)
                hbRecorder.isAudioEnabled(false)
                hbRecorder.setMaxDuration(10)
                hbRecorder.startScreenRecording(data, result.resultCode)
                viewModel.setRecordingState(true)
            }
        }

    private fun stopRecording() {
        hbRecorder.stopScreenRecording()
        viewModel.setRecordingState(false)
    }

    override fun HBRecorderOnStart() {
        Log.i("SCREEN_RECORDER", "###################### RECORD STARTED!")
    }

    override fun HBRecorderOnComplete() {
        Log.i("SCREEN_RECORDER", "###################### RECORD COMPLETED!")
    }

    override fun HBRecorderOnError(
        errorCode: Int,
        reason: String?,
    ) {
        Log.e(
            "SCREEN_RECORDER",
            "###################### HBRecorderOnError(ERROR_CODE: '$errorCode', REASON: '$reason'",
        )
    }

    override fun HBRecorderOnPause() {
    }

    override fun HBRecorderOnResume() {
    }
}

class ScreenRecorderViewModel : ViewModel() {
    private val _isRecording = MutableStateFlow(false)
    val isRecording: StateFlow<Boolean> = _isRecording

    private val _audioEnabled = MutableStateFlow(false)
    val audioEnabled: StateFlow<Boolean> = _audioEnabled

    fun setRecordingState(isRecording: Boolean) {
        _isRecording.value = isRecording
    }

    fun setAudioState(audioEnabled: Boolean) {
        _audioEnabled.value = audioEnabled
    }
}

fun getAvailableStorage(): Float {
    val storagePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES)

    if (Environment.getExternalStorageState(storagePath) == Environment.MEDIA_MOUNTED) {
        val statFs = StatFs(storagePath.absolutePath)
        val availableBlocks = statFs.availableBlocksLong
        val blockSize = statFs.blockSizeLong

        return (availableBlocks * blockSize * 1.0f) / (1024 * 1024 * 1024)
    }

    return 0.0f // Return 0 if storage is not mounted
}

@Composable
fun ScreenRecorderUI(
    viewModel: ScreenRecorderViewModel,
    onClickFunction: () -> Unit,
) {
    val isRecording by viewModel.isRecording.collectAsState()
    val audioEnabled by viewModel.audioEnabled.collectAsState()
    val totalStorage = String.format("%.2f", getAvailableStorage())

    var text by remember { mutableStateOf(TextFieldValue("")) }
    var isValid by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    fun validateInput(input: String): Boolean =
        when {
            input.isBlank() -> {
                errorMessage = "The field cannot be empty"
                false
            }

            !input.matches(Regex("^[1-9]\\d*\$")) -> {
                errorMessage = "Type a positive number greater than zero"
                false
            }

            else -> {
                errorMessage = null
                true
            }
        }

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.systemBars)
                .windowInsetsPadding(WindowInsets.navigationBars),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            modifier =
                Modifier
                    .padding(bottom = 16.dp),
            value = text,
            onValueChange = {
                text = it
                isValid = validateInput(it.text)
            },
            label = { Text("Time (in seconds)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            isError = errorMessage != null,
            singleLine = true,
        )

        if (errorMessage != null) {
            Text(
                text = errorMessage ?: "",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp),
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onClickFunction,
            enabled = isValid,
        ) {
            Text(if (isRecording) "Stop Recording" else "Start Recording")
        }
        Button(
            onClick = {
                viewModel.setAudioState(!audioEnabled)
            },
        ) {
            Text(if (audioEnabled) "Audio Enabled" else "Audio Disabled")
        }
        Text(
            text = "Total Storage: $totalStorage GB",
        )
    }
}
