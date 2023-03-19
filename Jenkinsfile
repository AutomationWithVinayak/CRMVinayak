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
  }
  
 post {
    always {
      // Define the directory where TestNG results will be saved
      def testngResultsDir = "${env.WORKSPACE}\\target\\surefire-reports\\testng-results.xml"

      // Archive the TestNG results directory
      archiveArtifacts artifacts: "${testngResultsDir}", allowEmptyArchive: true

      // Generate the TestNG report using the TestNG Results plugin
      step([$class: 'TestNGResultArchiver', testResults: "${testngResultsDir}"])
    }
  }
}