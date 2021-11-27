pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                bat 'echo Building version: %BUILD_NUMBER%'
                bat 'mvn install'
            }
        }
        stage("test"){
            steps{
                echo 'testing the application'
                bat 'mvn test'
            }
        }
        stage("deploy"){
            steps{
                echo 'deploying the application to docker'
                bat 'echo %cd%'
                bat 'docker build -f Dockerfile -t jautomation:1.%BUILD_NUMBER% .'
                bat 'docker run -d jautomation:1.%BUILD_NUMBER%'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}