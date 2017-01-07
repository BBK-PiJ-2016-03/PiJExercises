print "Please enter your first number: "
String input1 = System.console().readLine()
int number1 = Integer.parseInt(input1)

print "Please enter your second number: "
String input2 = System.console().readLine()
int number2 = Integer.parseInt(input2)

println number1 + " x " + number2 + " = " + multiply(number1, number2)

def multiply(int num1, int num2){
	int number = num1
	int times = num2
	int result;

	if(num1 < num2){
		number = num2
		times = num1
	}

	for(int i = 1; i <= times; i++){
		result += number
	}

	return result
}