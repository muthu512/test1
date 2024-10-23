pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your GitHub repository
                git 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Build') {
            steps {
                // Build your Spring Boot application
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                // Run the JAR file
                sh 'java -jar target/test-main.zip'
            }
        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }
        failure {
            echo 'Deployment failed!'
        }
    }
}

