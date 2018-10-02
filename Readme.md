This is a project for a workshop.

Prerequisites
-------------
* JDK 8 (JDK, not JRE) - validate by running `javac` from the command line
* IntelliJ
* Heroku Command Line
* Git Command Line for Windows
* Homebrew for Mac
 
General Guidance
----------------
On windows, be sure to run all the commands within the 'Git Bash' terminal

The build the application you should execute:

  Mac/Linux: `./gradlew clean build`
  Windows: `gradlew clean build`
    
To run the application you should execute:

  Mac/Linux: `./gradlew bootRun`
  Windows: `gradlew bootRun`
    
To run the unit tests you should execute:

  Mac/Linux: `./gradlew test`
  Windows: `gradlew test`

To runt he cucumber tests you should execute:

  Mac/Linux: `./gradlew intTest`
  Windows: `gradlew intTest`
