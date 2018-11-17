pipeline {
  agent any
  stages {
    stage('Build Code') {
      when {
        branch 'master'
      }
      steps {
        sh 'mvn clean package'
	sh 'echo "Build Done"'
        sh 'cp -rf target/demo-0.0.1-SNAPSHOT.jar /home/p/Meetup/demo.jar'
      }
    }
    when {
      not {
        branch 'master'
      }
    }
    steps {
       sh 'echo "Skipped becuase not master"'
    }
  }
  post {
        always {
            junit 'target/**/*.xml'
        }
  }
}
