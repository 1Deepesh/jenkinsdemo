def call (def command) {
    if (command == "" || command == null) {
        println ("please select an input")
    } 
    else if (command == "build") {
        pipeline {
            agent any 
            stages {
                stage ('a') {
                    steps {
                    println "====================================\n\t\texecute build\t\t\n================================="
                    }
                }
            }
            post {
                always {
                    echo "The build got executed successfully, now you can send emails also to the stake holders."
                }
            }
        }        
    }
    else {
        println ("please select a valid option i.e. build / deploy")
    }
    
}
