<!-- PROJECT LOGO -->
<div align="center">
  <h1 align="center">PetStore App</h1>
  <p align="center">API Testing Project</p>
</div>

<!-- TABLE OF CONTENTS -->
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#built-with">Built With</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#useful documentation">Useful Documentation</a></li>
  </ol>


### About The Project

The project focuses on testing the Simple Grocery API, using core testing tools such as Java, and OkHttp. The goal of the project is to improve testing skills and gain experience in web testing.

### Built With

* Programming Language: Java
* Frameworks: TestNG, OkHttp
* Build tool: Gradle
* Mocking tool: WireMock Docker

### Usage
Steps to run it:

1. To run the test please find the download wiremock .jar here: https://wiremock.org/docs/download-and-installation/

2. Run this command in your terminal: java -jar wiremock-standalone-3.0.0-beta-15.jar  (the version should match your .jar version also
make sure you run the command in the directory where the .jar file is)

3. Then run:  ./gradlew test in your IDE (I used IntelliJ) terminal

### Useful Documentation
* [TestNG](https://testng.org/doc/documentation-main.html)





