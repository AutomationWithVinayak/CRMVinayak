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
    bat 'C:\\Program Files\\Java\\jdk1.8.0_281\\bin\\javac -d build src/*.java'
  }
}
    stage('Test') {
      steps {
        bat 'java -cp build com.vinayak.test'
      }
    }
  }
}
