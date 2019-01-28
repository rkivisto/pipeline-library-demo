def call(){
  node {
     stage('test'){
       properties([[$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', numToKeepStr: '4']]])
       echo 'Hello World'
    }
  }
}
