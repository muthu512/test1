pipeline {
    agent any 

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from your GitHub repository
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Unzip File') {
            steps {
                // Unzip the file to extract the JAR
                sh 'unzip online-1.zip'
            }
        }

        stage('Verify JAR') {
            steps {
                // Verify that the JAR file exists after unzipping
                sh 'ls -la your-extracted-jar-file.jar'
            }
        }

        stage('Run JAR') {
            steps {
                // Run the extracted JAR file
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

