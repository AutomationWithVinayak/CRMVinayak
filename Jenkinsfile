pipeline {
  agent any
tools{
        maven 'mvn'
    }
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}

  stages {
    stage('Build') {
      steps {
              git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'

      }
    }
    stage('Run tests') {
      when {
        // Add a condition to check if the specific test case needs to be run
        expression { params.RUN_SPECIFIC_TEST == true }
      }
      steps {
        // Run the specific test case here
        bat 'mvn compile'
        bat 'mvn test -Dtest=com.vinayak.regression.Test1'
      }
    }
  }
}
