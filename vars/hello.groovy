def call(Map config) {
	node {
		echo "${config.greeting} ${config.name}!"
	}
}
