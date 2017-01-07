String input = ""

while(input != "q"){
	print "Please enter an integer to check if it is a prime (q to quit): "
	input = System.console().readLine()
		
	try{

		int number = Integer.parseInt(input)
		String message = isPrime(number) ? " is a prime!" : " is not a prime"
		println number + message
	}
	catch(NumberFormatException e){
		if(input != "q")
			println "That was not a valid integer"
	}
	
}

def isPrime(number){
	//a prime number can only be divided without remainder by itself and one
	boolean prime = true;
	for(int i = 2; i < number; i++){
		if(number % i == 0){
			prime = false
			break
		}
	}
	return prime
}