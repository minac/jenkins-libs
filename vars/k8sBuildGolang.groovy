<<<<<<< HEAD
def call(sourceFile) {
    sh "go get -d -v -t"
    sh "go test --cover -v ./... --run UnitTest"
    sh "go build -v -o ${sourceFile}"
=======
def call(String programToBuild) {
    sh "go get -d -v -t"
    //sh "go test --cover -v ./... --run UnitTest"
    sh "go build -v ${programToBuild}"
>>>>>>> dbbf9fc4d6d18838b20a1f26848bcaace16a3421
}
