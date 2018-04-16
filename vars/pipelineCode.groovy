def call(){
  node {
     echo 'Hello World'
     echo getBuildCause()
  }
}
