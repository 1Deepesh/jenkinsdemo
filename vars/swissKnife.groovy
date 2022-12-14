def printName(name){
	println name
}


// note: to use this kind of function, we need to call in our jenkins file like below:

// node() {
// 	stage('a') {
// 	  //nameofgroovyfile.functionname (parameter)
// 	  swissKnife.printName ('John')	
// 	}

// }


def sayMyAge(def age) {
	println ("Hello Mr. $name, You are $age years old.") 
}
