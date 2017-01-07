String input = ""
int last = -1; 
boolean consecutive = true

while(input != "-1"){
	print last == -1 ? "Please enter a number: " : "Please enter next number (-1 to terminate): "
	input = System.console().readLine()
	int number = Integer.parseInt(input)

	if(number != -1 
	&& last != -1 
	&& number != last + 1){
		consecutive = false
	}

	last = number
}

println consecutive ? "Yes" : "No"