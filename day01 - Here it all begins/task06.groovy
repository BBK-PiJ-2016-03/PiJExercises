print "Please enter a number: "
String input1 = System.console().readLine()
int number1 = Integer.parseInt(input1)

print "What would you like to divide your number by? "
String input2 = System.console().readLine()
int number2 = Integer.parseInt(input2)

int[] result = divide(number1, number2)

println number1 + " divided by " + number2 + " is " + result[0] + " remainder " + result[1]

def divide(int num1, int num2){

	int[] division = new int[2]

	int quotient = 0
	int remainder = num1
	while(remainder >= num2){
		remainder -= num2
		quotient++
	}

	division[0] = quotient
	division[1] = remainder
	
	return division
}