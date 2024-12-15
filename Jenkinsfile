pipeline {
    agent any

    stages{
        stage("Update and deploy"){
            steps{
                script{
                    def remote = [:];
                remote.name = env.DEVOPS_IP;
                remote.host = env.DEVOPS_IP;
                remote.user = env.REMOTE_USER;
                remote.password = env.REMOTE_PASSWORD;
                remote.allowAnyHosts = true;

                sshCommand remote: remote, command: "cd angular && ./deploy-backend.sh"

                }
            }
        }
   }
}