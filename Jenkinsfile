pipeline {
    agent any
    stages{
        stage("SSH"){
            steps{
                script{                    
                    withCredentials([sshUserPrivateKey(credentialsId: 'emp-key', keyFileVariable: 'PK',  usernameVariable: 'userName')]) {
                        def remote = [:];
                        remote.name = "34.67.84.34";
                        remote.host = "34.67.84.34";
                        remote.user = userName;
                        remote.identityFile = PK;
                        remote.allowAnyHosts = true;
                        sshCommand remote: remote, command: "cd emp-backend && ./deploy-backend.sh"

                    }
                }
            }
        }
   }
}