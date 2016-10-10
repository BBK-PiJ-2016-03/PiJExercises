String input = ""
int max = -1; 
while(input != "-1"){
	print max == -1 ? "Please enter a number: " : "Please enter next number (-1 to terminate): "
	input = System.console().readLine()
	int number = Integer.parseInt(input)

	if(number > max)
		max = number
}

println "\nThe largest number was: " + max
