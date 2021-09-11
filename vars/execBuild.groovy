def call (String command = "build") {
    if (command == 'build') {
        pipeline {
            agent any
            stages {
                stage('build') {
                    steps {
                        echo "=========================="
                        echo "     BUILD EXECUTED     "
                        echo "========================"
                    }
                }
            }
        }
    } else if (command == 'deploy') {
        node() {
            stage("deploy") {
                println "==================="
                println "  deploy executed   "
                println "==================="
            }
        }
    } else if (command == "sleep") {
        pipeline {
            agent any
            stages {
                stage('sleep') {
		steps {
                    sh 'sleep 30' }
                }
            }
        }
    }
    else {
        node {
            println "DO NOTHING ........."
        }
    }
}

