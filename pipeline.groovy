pipeline {
    agent any

    environment {
        ARCHIVA = credentials('archiva')
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/tkgregory/gradle-credentials-jenkins.git'

                sh './gradlew build'
            }
        }
    }
}