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
   
    
  }
}
