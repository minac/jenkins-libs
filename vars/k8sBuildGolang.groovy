def call(sourceFile) {
    sh "go get -d -v -t"
    sh "go test --cover -v ./... --run UnitTest"
    sh "go build -v -o ${sourceFile}"
}
