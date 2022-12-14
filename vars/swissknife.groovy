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
