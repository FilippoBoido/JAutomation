pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo 'building the application in '
                bat 'echo %cd%'
                bat 'mvn clean install'
            }
        }
        stage("test"){
            steps{
                echo 'testing the application'
                bat 'mvn clean test'
            }
        }
        stage("deploy"){
            steps{
                echo 'deploying the application..'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}