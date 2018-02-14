// https://opensource.org/licenses/MIT
def call() {
	def buildCauses = ''
	def causes = currentBuild.rawBuild.getCauses()
	for ( Cause cause : causes ) {
		buildCauses += cause.getShortDescription()
	}
	return buildCauses
}
