pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('CheckOut Git') {
            steps {
                echo 'pulling ....';
                git branch : 'Naoures_branch',
                url : 'https://github.com/hamza-melki/SpringRepoBackEnd.git'
            }
        }
        stage('Testing MAVEN') {
            steps {
                sh """mvn -version"""
            }
        }
    }
}
