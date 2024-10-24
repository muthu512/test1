pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/muthu512/test1.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                sh './mvnw clean package'
            }
        }

        stage('Verify JAR') {
            steps {
                // Verify the JAR file exists in the target directory
                sh 'ls -la target/*.jar'
            }
        }

        stage('Run JAR') {
            steps {
                // Run the JAR file from the target directory
                sh 'java -jar target/*.jar'
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


