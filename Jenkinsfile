pipeline {
  agent any
  
  
  
  stages {
    stage('Maven Version') {
      steps {
      
      bat label: '',script:'mvn -v'
      
      }
    }
    
    stage('Run Tests') {
      steps {
        bat label: '',script: 'mvn clean test'
        
      }
    }
  }
}
