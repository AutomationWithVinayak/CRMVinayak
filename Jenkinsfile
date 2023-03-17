pipeline {
  agent any
  tools {
    maven 'Maven 3.8.6'
  }
  environment {
    PATH = "C:\\WINDOWS\\SYSTEM32"
  }
  stages {
    stage('Build') {
      steps {
        git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'
        bat 'mvn clean install'
      }
    }
    stage('Run tests') {
      steps {
        // Run the entire test package here
        bat 'mvn test -Dtest=com.vinayak.regression.*'
      }
    }
  }
}
