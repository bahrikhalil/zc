pipeline{
    agent any
    tools{
        maven '3.8.6'
    }
    environment {
            registry = "YourDockerhubAccount/YourRepository"
}
    
    stages{
        stage("pulling"){
        steps{
            git branch: 'master', url: 'https://github.com/bahrikhalil/zc.git'
        }
    }
   
 stage("building"){
        steps{
            sh 'mvn clean install'
        }
    }
    stage("sonar-check"){
        steps{
            script{
                 withSonarQubeEnv(installationName: 'sonar-9.6.1' , credentialsId: 'jenkins'){
                 sh 'mvn sonar:sonar'
                 }
                 timeout(time:300 , unit: 'SECONDS') {
                    def qg = waitForQualityGate()
                  if (qg.status != 'OK') {
                       error "Pipeline aborted due to quality gate failure: ${qg.status}"
              }
            }
          }
        }
    }
   // stage('Building our image') {
         //  steps{
           //  script {
             //   dockerImage = docker.build registry + ":$BUILD_NUMBER"
             // }
        //    }
      //    }
    
  }
}
