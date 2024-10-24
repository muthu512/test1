pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your GitHub repository on the main branch
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Download JAR') {
            steps {
                // Verify the JAR file exists (you have already uploaded the JAR file to GitHub)
                sh 'ls target/test-main.jar'
            }
        }

        stage('Run JAR') {
            steps {
                // Run the JAR file
                sh 'java -jar target/test-main.jar'
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


