def call() {
	// https://jenkins.io/blog/2016/10/16/stage-lock-milestone/
	// The first milestone step starts tracking concurrent build order
	milestone label: 'build', ordinal: 1
	echo 'compiling...'
	echo "boolParam=${boolParam}"
	sh 'touch a.jar'
	stash includes: 'a.jar', name: 'myApp'
}
