pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // GitHub 저장소에서 코드 체크아웃
                git url: 'https://github.com/yourusername/yourrepository.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                // 빌드 단계
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // 테스트 단계
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                // 패키징 단계
                sh 'mvn package'
            }
        }
    }
    post {
        always {
            // 테스트 결과 보고
            junit '**/target/surefire-reports/*.xml'
        }
        success {
            // 빌드 아티팩트 보관
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
