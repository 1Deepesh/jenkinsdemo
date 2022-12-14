def call (pathToFile) {
    if (pathToFile == "" || pathToFile == null ) {
        def pathToFile = "jenkinsdemo/vars/readConfigValue.groovy"
    }
    // read the yaml file
    raw_data = readYaml (file: 'pathToFile')
    config_data = raw_data.environment 
    println (name)


}
