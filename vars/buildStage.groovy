def call() {
	stage('Build') {
		agent any
		steps {
			// https://jenkins.io/blog/2016/10/16/stage-lock-milestone/
			// The first milestone step starts tracking concurrent build order
			milestone label: 'build', ordinal: 1
			echo 'compiling...'
			sh 'touch a.jar'
			stash includes: 'a.jar', name: 'myApp'
		}
	}
}
