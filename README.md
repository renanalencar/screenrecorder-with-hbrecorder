<p align="center">
    <img src="screen-recorder.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">SCREENRECORDER-WITH-HBRECORDER</h1></p>
<p align="center">
	<em>Capture moments, unleash creativity, share effortlessly.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/renanalencar/screenrecorder-with-hbrecorder?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/renanalencar/screenrecorder-with-hbrecorder?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/renanalencar/screenrecorder-with-hbrecorder?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/renanalencar/screenrecorder-with-hbrecorder?style=default&color=0080ff" alt="repo-language-count">
</p>
<p align="center"><!-- default option, no dependency badges. -->
</p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>
<br>

##  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Project Structure](#-project-structure)
  - [ Project Index](#-project-index)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Testing](#-testing)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)


##  Overview

Screenrecorder-with-hbrecorder is a user-friendly tool that simplifies screen recording on Android devices. With intuitive controls for starting and stopping recordings, managing audio settings, and checking storage availability, this project enhances the user experience. Ideal for content creators, educators, and professionals needing a reliable screen recording solution.


##  Features

|      | Feature         | Summary       |
| :--- | :---:           | :---          |
| ⚙️  | **Architecture**  | <ul><li>Follows a clean **MVC** architecture pattern.</li><li>Utilizes **ViewModel** to manage UI-related data in a lifecycle-conscious way.</li><li>Separates concerns with **UI**, **ViewModel**, and **data** layers.</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Consistent code style enforced using **Kotlin** coding conventions.</li><li>Utilizes **ProGuard** for code obfuscation and optimization.</li><li>Includes comprehensive **unit** and **instrumented** tests for code validation.</li></ul> |
| 📄 | **Documentation** | <ul><li>Extensive documentation in **Kotlin** with clear code comments.</li><li>Includes **ProGuard rules** documentation for code optimization.</li><li>**Gradle** build scripts are well-documented for easy setup and configuration.</li></ul> |
| 🔌 | **Integrations**  | <ul><li>Integrates with **AndroidX** libraries for enhanced Android development.</li><li>Utilizes **Compose** for modern UI development.</li><li>Includes **testing frameworks** for robust testing integration.</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Codebase is modularized into separate **sub-projects/modules** for better organization.</li><li>**Shared configurations** ensure consistency across modules.</li><li>**Dependency management** is centralized for easy updates and maintenance.</li></ul> |
| 🧪 | **Testing**       | <ul><li>Includes **unit tests** for logic validation.</li><li>**Instrumented tests** ensure app functionality on Android devices.</li><li>**Comprehensive test coverage** for reliable code validation.</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Optimizes code using **ProGuard** for efficient app performance.</li><li>**UI rendering** is optimized for smooth user experience.</li><li>**Storage availability checks** for efficient resource management.</li></ul> |
| 🛡️ | **Security**      | <ul><li>Utilizes **ProGuard** for code obfuscation and enhancing app security.</li><li>**Preserves line number info** for debugging stack traces.</li><li>Enhances **app security** through controlled configuration files.</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Manages **library versions** and dependencies using **gradle/libs.versions.toml**.</li><li>Includes **external dependencies** for enhanced functionality.</li><li>**Centralized dependency management** for easy updates and maintenance.</li></ul> |


##  Project Structure

```sh
└── screenrecorder-with-hbrecorder/
    ├── LICENSE
    ├── app
    │   ├── .gitignore
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   └── src
    ├── build.gradle.kts
    ├── gradle
    │   ├── libs.versions.toml
    │   └── wrapper
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    └── settings.gradle.kts
```


###  Project Index
<details open>
	<summary><b><code>SCREENRECORDER-WITH-HBRECORDER/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
				<td>- Facilitates Gradle execution by setting up JVM options, locating Java, and running Gradle tasks<br>- Resolves paths and initializes necessary variables for the Gradle wrapper<br>- Ensures proper Java configuration and classpath setup for seamless Gradle operations.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/build.gradle.kts'>build.gradle.kts</a></b></td>
				<td>- Configures common build options for all sub-projects/modules by disabling the application, Android, and Compose plugins<br>- This file sets up shared configurations across the codebase, ensuring consistency and streamlined development processes.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/settings.gradle.kts'>settings.gradle.kts</a></b></td>
				<td>Configure plugin and dependency repositories for the project to manage external dependencies and plugins effectively.</td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- gradle Submodule -->
		<summary><b>gradle</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/gradle/libs.versions.toml'>libs.versions.toml</a></b></td>
				<td>Manage library versions and dependencies for the project using the gradle/libs.versions.toml file.</td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- app Submodule -->
		<summary><b>app</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/build.gradle.kts'>build.gradle.kts</a></b></td>
				<td>- Configure Android application settings, dependencies, and build features for the Screen Recorder project<br>- Set up application namespace, compile and target SDK versions, versioning, and build types<br>- Include necessary AndroidX libraries, Compose dependencies, and testing frameworks<br>- Enable ProGuard for release builds and specify Java and Kotlin compatibility options.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/proguard-rules.pro'>proguard-rules.pro</a></b></td>
				<td>- Defines ProGuard rules for Android project to optimize and obfuscate code<br>- Controls configuration files applied during build<br>- Enables preserving line number info for debugging stack traces<br>- Can specify JavaScript interface class for WebView<br>- Helps enhance app security and performance.</td>
			</tr>
			</table>
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>br</b></summary>
										<blockquote>
											<details>
												<summary><b>com</b></summary>
												<blockquote>
													<details>
														<summary><b>renanalencar</b></summary>
														<blockquote>
															<details>
																<summary><b>screenrecorder</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/main/java/br/com/renanalencar/screenrecorder/MainActivity.kt'>MainActivity.kt</a></b></td>
																		<td>- The MainActivity file orchestrates screen recording functionality within the app, handling start and stop recording actions based on user input<br>- It also manages audio settings and storage availability checks<br>- The ScreenRecorderViewModel class maintains the recording state and audio settings<br>- The ScreenRecorderUI function renders the user interface elements for recording control and displays storage information.</td>
																	</tr>
																	</table>
																	<details>
																		<summary><b>ui</b></summary>
																		<blockquote>
																			<details>
																				<summary><b>theme</b></summary>
																				<blockquote>
																					<table>
																					<tr>
																						<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/main/java/br/com/renanalencar/screenrecorder/ui/theme/Theme.kt'>Theme.kt</a></b></td>
																						<td>- Defines the theme for the screen recorder UI, adapting to system dark mode<br>- Determines color scheme based on dynamic or predefined settings, ensuring a consistent visual experience<br>- Integrates with MaterialTheme for typography and content styling.</td>
																					</tr>
																					<tr>
																						<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/main/java/br/com/renanalencar/screenrecorder/ui/theme/Type.kt'>Type.kt</a></b></td>
																						<td>Define typography styles for a Compose UI theme in the provided code file.</td>
																					</tr>
																					<tr>
																						<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/main/java/br/com/renanalencar/screenrecorder/ui/theme/Color.kt'>Color.kt</a></b></td>
																						<td>Define color constants for the UI theme in the project.</td>
																					</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<details>
						<summary><b>androidTest</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>br</b></summary>
										<blockquote>
											<details>
												<summary><b>com</b></summary>
												<blockquote>
													<details>
														<summary><b>renanalencar</b></summary>
														<blockquote>
															<details>
																<summary><b>screenrecorder</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/androidTest/java/br/com/renanalencar/screenrecorder/ExampleInstrumentedTest.kt'>ExampleInstrumentedTest.kt</a></b></td>
																		<td>- Verifies the app context by executing an instrumented test on an Android device<br>- The test ensures that the package name matches the expected value<br>- This file is crucial for validating the correct functioning of the app within the testing environment.</td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<details>
						<summary><b>test</b></summary>
						<blockquote>
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<details>
										<summary><b>br</b></summary>
										<blockquote>
											<details>
												<summary><b>com</b></summary>
												<blockquote>
													<details>
														<summary><b>renanalencar</b></summary>
														<blockquote>
															<details>
																<summary><b>screenrecorder</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/master/app/src/test/java/br/com/renanalencar/screenrecorder/ExampleUnitTest.kt'>ExampleUnitTest.kt</a></b></td>
																		<td>Verifies correctness of addition operation in unit tests for the Screen Recorder app.</td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

##  Getting Started

###  Prerequisites

Before getting started with screenrecorder-with-hbrecorder, ensure your runtime environment meets the following requirements:

- **Programming Language:** Kotlin
- **Package Manager:** Gradle


###  Installation

Install screenrecorder-with-hbrecorder using one of the following methods:

**Build from source:**

1. Clone the screenrecorder-with-hbrecorder repository:
```sh
❯ git clone https://github.com/renanalencar/screenrecorder-with-hbrecorder
```

2. Navigate to the project directory:
```sh
❯ cd screenrecorder-with-hbrecorder
```

3. Install the project dependencies:


**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle build
```




###  Usage
Run screenrecorder-with-hbrecorder using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle run
```


###  Testing
Run the test suite using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle test
```


##  Project Roadmap

- [X] **`Task 1`**: <strike>Implement feature one.</strike>
- [ ] **`Task 2`**: Implement feature two.
- [ ] **`Task 3`**: Implement feature three.


##  Contributing

- **💬 [Join the Discussions](https://github.com/renanalencar/screenrecorder-with-hbrecorder/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/renanalencar/screenrecorder-with-hbrecorder/issues)**: Submit bugs found or log feature requests for the `screenrecorder-with-hbrecorder` project.
- **💡 [Submit Pull Requests](https://github.com/renanalencar/screenrecorder-with-hbrecorder/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/renanalencar/screenrecorder-with-hbrecorder
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/renanalencar/screenrecorder-with-hbrecorder/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=renanalencar/screenrecorder-with-hbrecorder">
   </a>
</p>
</details>


##  License

This project is protected under the [MIT](https://choosealicense.com/licenses/mit/) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/mit/) file.


##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

