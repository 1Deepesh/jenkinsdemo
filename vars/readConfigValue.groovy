def call (pathToFile) {
    if (pathToFile == "" || pathToFile == null ) {
        def pathToFile = "jenkinsdemo/resources/com/acceleratedskillup/feature-dev.yml"
    }
    // read the yaml file
    raw_data = readYaml (file: 'pathToFile')
    config_data = raw_data.environment 
    println (name)


}
