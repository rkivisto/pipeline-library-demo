def call(){
  node {
     stage('test'){
       properties([[$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', numToKeepStr: '2']]])
       echo 'Hello World'
    }
  }
}
