pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the 'main' branch where the Jenkinsfile and source code are
                git branch: 'main', url: 'https://github.com/your-username/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                // Run Maven to build the project and create the JAR file
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Run the newly created JAR file
                sh 'java -jar target/online-1-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}



