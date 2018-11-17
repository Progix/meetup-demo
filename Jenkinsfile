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
      }
    }
  }
  post {
        always {
            junit 'target/**/*.xml'
        }
  }
}
