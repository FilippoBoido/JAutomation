pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo 'building the application..'
                bat 'mvn clean install'
            }
        }
        stage("test"){
            steps{
                echo 'testing the application..'
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
            junit '**/reports/junit/*.xml'
        }
    }
}