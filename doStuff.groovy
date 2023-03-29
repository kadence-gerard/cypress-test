pipeline {
    agent {
        docker {
            label 'amd'
            // image 'cypress/base:latest'
            // image 'cypress/included:cypress-12.8.1-node-18.14.1-chrome-111.0.5563.110-1-ff-111.0-edge-111.0.1661.51-1'
            image 'ubuntu-2004:202010-01'
        }
    }
    
    stages {
        stage('build and test') {
            steps {
                sh 'ls'
                // sh 'docker run -it -v $PWD:/e2e -w /e2e cypress/base:latest'
                // sh 'npm ci'
                // sh "npx cypress run"
                sh './doStuff.sh'
            }
        }
    }

    post {
        always {
            echo ****************in post**************
        }
    }
}