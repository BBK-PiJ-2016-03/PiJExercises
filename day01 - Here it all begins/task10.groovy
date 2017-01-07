String input = ""
int last = -1; 
boolean consecutive = true
boolean ascending = true
int i = 0;
while(input != "-1"){
	print last == -1 ? "Please enter a number: " : "Please enter next number (-1 to terminate): "
	input = System.console().readLine()
	int number = Integer.parseInt(input)

	if(i == 1){
		if(number < last){
			ascending = false
		}
	}

	if(number != -1 
	&& last != -1 
	&& (
		(ascending && number != last + 1) 
		|| !ascending && number != last - 1
		)
	){
		consecutive = false
	}

	last = number
	i++
}

println consecutive ? "Yes" : "No"