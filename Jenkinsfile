pipeline {
  agent any
tools{
        maven 'mvn'
    }
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}

  stages {
    stage('Build') {
      steps {
              git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'

      }
    }
    stage('Test') {
   
      steps {
     
        bat 'mvn compile'
        bat 'mvn test -Dtest=com.vinayak.test'
      }
    }
  }
}
