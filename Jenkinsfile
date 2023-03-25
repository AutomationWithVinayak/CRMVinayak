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
        bat 'mvn package'
      }
    }
    
    stage('Test') {
      steps {	
      
    bat 'mvn test -Dtest=com.vinayak.regression\\*'
      }
    
    }
    stage('mail'){
      steps{
      
        mail bcc: '', body: '''Hi Team ,

Please  Job Executed Please Check it.

Thanks and Regards
Vinayak Bhandurge
7775933667''', cc: 'vinayakbhandurge1@gmail.com', from: 'vinayakbhandurge0285@gmail.com', replyTo: '', subject: 'Jenkine Job Result', to: 'vinayakbhandurge0285@gmail.com'
      
        
      }
    }
   
}

  
}
