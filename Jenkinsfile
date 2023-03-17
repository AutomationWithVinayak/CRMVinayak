pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        bat 'javac -d build src/*.java'
      }
    }
    stage('Test') {
      steps {
        bat 'java -cp build com.vinayak.test'
      }
    }
  }
}
