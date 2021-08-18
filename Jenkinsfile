pipeline {
    agent any
    stages {
        stage ("build") {
            steps {
            echo "building."
        }
        }
        stage ('deploying') {
                when {
                    buildingTag()
                }
                steps {
                    echo "hello world... building the tag only"
                }
        }
    }
}