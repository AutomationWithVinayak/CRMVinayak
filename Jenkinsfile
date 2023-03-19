pipeline {
  agent any

  tools {
    maven 'mvn'
  }
  
  environment {
    PATH = "C:\\Program Files\\Java\\jdk1.8.0_281\\bin;C:\\WINDOWS\\SYSTEM32"
  }

  stages {
    stage('clean') {
      steps {
        git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'
        bat 'mvn clean'
      }
    }
  
    stage('Build') {
      steps {
        bat 'mvn build'
      }
    }
    
    stage('Test') {
      steps {
        bat 'mvn test -Dtest=com.vinayak.test.*'
      }
    
    }
    stage('Report') {
    steps {
        dir("${env.WORKSPACE}/target") {
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '.', reportFiles: 'index.html', reportName: 'Test Results'])
        }
    }
}
  
}
