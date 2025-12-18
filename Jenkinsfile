pipeline {
    agent any

    tools {
        maven 'mvn'
        jdk 'jdk'
    }

    stages {
        stage('Cloning Git') {
            steps {
                // Kendi repo adresiniz doğru görünüyor, buraya ekledim:
                git branch: 'main', url: 'https://github.com/hozturklaba/SelenideTest.git'
            }
        }

        stage('Run Test') {
            steps {
                // Testleri çalıştır (Hata alsa bile devam etmesi için try-catch eklenebilir ama şimdilik standart kalsın)
                sh 'mvn clean install -DskipTests'
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Allure raporunu oluştur
            allure includeProperties: false, jdk: 'jdk', results: [[path: 'target/allure-results']]
        }
    }
}