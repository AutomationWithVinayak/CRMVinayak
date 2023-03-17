pipeline {
  agent any

  tools {
    maven 'mvn'
  }
  
  environment {
    PATH = "C:\\Program Files\\Java\\jdk1.8.0_281\\bin;C:\\WINDOWS\\SYSTEM32"
  }

  stages {
    stage('Build') {
      steps {
        git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'
        bat 'mvn compile'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test -Dtest=com.vinayak.regression.Test1,Test2'
      }
    }
  }
}
