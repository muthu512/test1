pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your GitHub repository
                git 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Download JAR') {
            steps {
                // Download the JAR file from the GitHub repository
                sh 'curl -L -o test-main.jar https://github.com/muthu512/test1/raw/main/test-main.jar'
            }
        }

        stage('Run JAR') {
            steps {
                // Run the downloaded JAR file
                sh 'java -jar test-main.jar'
            }
        }
    }

    post {
        success {
            echo 'JAR file execution successful!'
        }
        failure {
            echo 'JAR file execution failed!'
        }
    }
}


