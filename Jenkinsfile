pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your GitHub repository
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Verify JAR') {
            steps {
                // Verify the JAR file exists in the repository
                sh 'ls -la test-main.jar'
            }
        }

        stage('Run JAR') {
            steps {
                // Run the JAR file from the checked-out repository
                sh 'java -jar test-main.jar'
            }
        }
    }

    post {
        success {
            echo 'JAR file executed successfully!'
        }
        failure {
            echo 'JAR file execution failed!'
        }
    }
}

