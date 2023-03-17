pipeline {
  agent any{
   
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
    
    stage('Build') {
      steps {
        // Build the project with Maven
        sh 'mvn clean package'
      }
    }
    
    stage('Run Tests') {
      steps {
        // Run all tests in the specified package
        sh 'mvn test -Dtest=com.vinayak.regression'
      }
    }
  }
}

