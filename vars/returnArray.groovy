def call(env){
  String[] result = [:]
  switch (env) {
    case 'a':
      result = ["a1", "a2", "a3"]                                             
      break
    case 'b':
      result = ["b1", "b2", "b3"]                                             
      break
    default:
      println "argument missing for call to returnArray(env)"
      currentBuild.result = 'FAILURE'
      break
  }
  println "Selected: " + result
  return result
}
