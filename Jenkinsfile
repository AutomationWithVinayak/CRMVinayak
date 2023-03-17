pipeline {
    agent any
    
tools{
        maven 'mvn'
    }
    environment {

    PATH = "C:\\WINDOWS\\SYSTEM32"

}
    stages{
        stage("Build"){
            steps{
            git branch: 'master', url: 'https://github.com/TestEngineer-I/CRMVinayak.git'
            bat 'mvn clean test -Dsuite=src/test/java/com/vinayak/regression'

            }
        }       
        
    }
}
