pipeline {
    agent any
    stages{
        stage("SSH"){
            steps{
                script{                    
                    withCredentials([sshUserPrivateKey(credentialsId: 'oci-backend', keyFileVariable: 'PK',  usernameVariable: 'userName')]) {
                        def remote = [:];
                        remote.name = "34.67.84.34";
                        remote.host = "34.67.84.34";
                        remote.user = userName;
                        remote.identityFile = PK;
                        remote.allowAnyHosts = true;
                        sshCommand remote: remote, command: "cd angular/emp-backend && ./deploy-backend.sh"

                    }
                }
            }
        }
   }
}