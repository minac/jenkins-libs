def call(outFile) {
    sh "go get -d -v -t"
    sh "go build -v -o ${outFile}"
}
