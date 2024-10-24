pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your Git repository
                git url: 'https://github.com/muthu512/test1.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run the Maven Wrapper to build the project
                    sh './mvnw clean package'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests using the Maven Wrapper
                    sh './mvnw test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Add your deployment logic here
                    echo 'Deploying application...'
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




