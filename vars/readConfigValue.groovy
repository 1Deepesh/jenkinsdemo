def call () {
    def pathToFile = libraryResource 'com/acceleratedskillup/feature-dev.yml'
    println (pathToFile)
    
    // read the yaml file
    raw_data = readYaml (text: pathToFile)
    config_data = raw_data.environment 
    println (config_data.name)
    
    for (i in config_data) { k,v ->
        env."$i.k" = "$i.v"
    }
    
    println (name)


}
