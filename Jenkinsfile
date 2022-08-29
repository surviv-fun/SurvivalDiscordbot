pipeline {
    agent any

    tools {
        jdk 'jdk-17'
    }

    stages {
        stage("Clean") {
            steps {
                sh "chmod +x ./gradlew";
                sh "./gradlew clean";
            }
        }

        stage("Build") {
            steps {
                sh "./gradlew build";
            }
        }

        stage("Build ShadowJar") {
            steps {
                sh "./gradlew shadowJar";
            }

            post {
                success {
                    archiveArtifacts artifacts: 'out/*.jar', fingerprint: true
                }
            }
        }
    }
}
