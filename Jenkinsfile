pipeline {
    agent any
    
tools{
        maven 'mvn'
    }
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}
    stages{
        stage("SCM Checkout"){
            steps{
            git 'https://github.com/TestEngineer-I/CRMVinayak.git'
            }
        }
        stage("Maven Build"){
            steps{
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test -pl src/test/java/com/vinayak/regression'
            }
        }

        stage('Report') {
            steps {
                junit 'path/to/your/package/target/surefire-reports/*.xml'
            }
        }
    }
}
