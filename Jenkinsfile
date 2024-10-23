pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your GitHub repository with the correct branch
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
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
                // Ensure the JAR file exists before attempting to run it
                script {
                    if (fileExists('target/test-main.jar')) {
                        // Run the JAR file
                        sh 'java -jar target/test-main.jar'
                    } else {
                        error 'JAR file not found!'
                    }
                }
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


