pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Build the application using Maven
                script {
                    sh './mvnw clean package'
                }
            }
        }

        stage('Test') {
            steps {
                // Run your tests here
                script {
                    sh './mvnw test'
                }
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application (e.g., copy JAR file to server)
                script {
                    // Replace this with your actual deployment command
                    sh 'scp target/online-1-0.0.1-SNAPSHOT.jar user@your-server:/path/to/deploy/'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}



