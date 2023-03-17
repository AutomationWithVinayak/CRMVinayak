pipeline {
    agent any
     tools{
        maven 'mvn'
    }
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}

    stages {
        stage('Checkout') {
            steps {
                bat 'git clone https://github.com/TestEngineer-I/CRMVinayak.git && cd CRMVinayak && git checkout master'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests=true'
            }
        }

        stage('Test') {
            steps {
               bat 'mvn clean install -Dtest=src/test/java/com/vinayak/regression'
            }
        }

        stage('Report') {
            steps {
                junit 'path/to/your/package/target/surefire-reports/*.xml'
            }
        }
    }
}
