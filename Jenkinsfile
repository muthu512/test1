pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Install Unzip') {
            steps {
                sh 'sudo apt-get update && sudo apt-get install -y unzip'
            }
        }

        stage('Unzip File') {
            steps {
                sh 'unzip online-1.zip'
            }
        }

        stage('Verify JAR') {
            steps {
                sh 'ls -la your-extracted-jar-file.jar'
            }
        }

        stage('Run JAR') {
            steps {
                sh 'java -jar your-extracted-jar-file.jar'
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


