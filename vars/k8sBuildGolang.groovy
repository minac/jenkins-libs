def call(String programToBuild) {
    sh "go get -d -v -t"
    //sh "go test --cover -v ./... --run UnitTest"
    sh "go build -v -o ${programToBuild}"
}
