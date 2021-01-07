pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        gradle "Gradle"
    }

    stages {
        stage('Build') {
          steps {
            sh "gradlew build"
          }
        }
        stage('Test') {
          steps {
            sh "gradlew test"
          }
        }
        stage('Deploy') {
          steps {
            sh "gradlew build deployHeroku"
          }
        }
    }
}
