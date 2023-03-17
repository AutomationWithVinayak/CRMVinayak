pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
         git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'      }
    }
    stage('Test') {
      steps {
        bat 'java -cp build com.vinayak.test'
      }
    }
  }
}
