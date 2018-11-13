def call(sourceFile) {
    sh "go get -d -v -t"
    sh "go build -v -o ${sourceFile}"
}
