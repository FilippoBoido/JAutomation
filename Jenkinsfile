pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                bat '%BUILD_NUMBER%'
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
                echo 'deploying the application to docker'
                bat 'docker build -t jautomation:1.6 .'
                bat 'docker run jautomation:1.6'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}