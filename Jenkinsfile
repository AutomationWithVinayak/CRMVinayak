pipeline {
  agent any
  
  environment {
    PATH = "/usr/bin:${env.PATH}"
  }
  
  stages {
    stage('Checkout') {
      steps {
        // Checkout the Git repository
        checkout([$class: 'GitSCM', 
                  branches: [[name: '*/master']], 
                  userRemoteConfigs: [[url: 'https://github.com/TestEngineer-I/CRMVinayak.git']]])
      }
    }
    
    stage('Run Tests') {
      steps {
        // Run all tests in the specified package
        sh './run_tests.sh com.vinayak.regression'
      }
    }
  }
}
