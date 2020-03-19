def call(args) {
sh "${tool 'maven3'}/bin/mvn ${args}"
}
