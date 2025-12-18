pipeline{
    agent any

    tools{
    maven 'mvn'
    jdk 'jdk'
    }

    stages{
        stage('Cloning Git'){
            steps{
            git branch: 'main', url: 'https://github.com/hozturklaba/SelenideTest.git'
            }
        }
        stage('Run Test'){
            steps{
            sh 'mvn clean install -DskipTests'
            sh 'mvn test'
            }
        }
    }

    post{
        always{
        allure includeProperties:false, jdk: 'jdk', results: [[path: 'target/allure-results']
        }
    }
}