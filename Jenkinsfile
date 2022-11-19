/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
    stages {
        stage('Git checkout') {
            steps {
                git branch: 'project-1', url: 'https://github.com/Pushkar8860/demojenkins.git'
            }
        }
        stage('Unit Testing') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Integration Testing') {
            steps {
                bat 'mvn verify -DskipUnitTests'
            }
        }
        stage(' Maven building ') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Static code analysis') {
            steps {
                withSonarQubeEnv(credentialsId: 'sonar-api') {
                    bat 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
