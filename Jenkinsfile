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
        
          stage('Checkout') {
            steps {
                git 'https://github.com/go0d0/Belajar_java_BackEnd.git'
            }
        }
               stage('Build & Test') {
            steps {
                dir('learn_ci_cd') {
                    sh 'mvn clean install'
                }
            }
        }
    }
    
}
