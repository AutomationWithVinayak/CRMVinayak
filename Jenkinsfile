pipeline {
  agent any
  tools {
    maven 'mvn'
  }
  environment {
    PATH = "C:\\WINDOWS\\SYSTEM32"
  }
  stages {
    stage('Build') {
      steps {
        git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'
        bat 'mvn clean'
      }
    }
    stage('Run tests') {
      steps {
        // Run the entire test package here
        bat "mvn test -Dtest=com.vinayak.test.*"
      }
    }
  }
}
