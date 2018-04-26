def call() {
	stage('Test') {
		agent any
		steps {
			unstash 'myApp'
			echo 'testing...'
		}
	}
}
