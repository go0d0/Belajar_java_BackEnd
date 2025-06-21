pipeline {
    agent any
    tools {
        maven 'maven-3'
                     jdk 'jdk-21'             
                     }
    stages {
        stage('Test Setup') {
            steps {
                sh 'mvn -v'
                sh 'java -version'
                sh 'git --version'
            }
        }
    }
}
