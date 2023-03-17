pipeline {
  agent any
  
  environment {
    PATH = "/usr/bin:${env.PATH}"
  }
  
  stages {
    stage('Maven Version') {
      steps {
      
      bat label: '',script:'mavn -v'
      
      }
    }
    
    stage('Run Tests') {
      steps {
        bat label: '',script: 'mvn clean test'
        
      }
    }
  }
}
