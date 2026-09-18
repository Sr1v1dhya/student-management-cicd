pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t student-management:latest .'
            }
        }
        stage('Deploy Container') {
            steps {
                sh 'docker stop student-app || true'
                sh 'docker rm student-app || true'
                sh 'docker run -d --name student-app student-management:latest'
            }
        }
    }
}
