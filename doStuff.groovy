pipeline {
  agent {
    docker {
      label 'amd'
      image 'cypress/base:latest'
    }
  }

  stages {
    stage('build and test') {
      steps {
        sh 'ls'
        // sh 'docker run -it -v $PWD:/e2e -w /e2e cypress/base:latest'
        sh 'npm ci'
        sh "npx cypress run"
      }
    }
  }
}