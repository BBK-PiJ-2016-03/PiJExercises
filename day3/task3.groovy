/*
3  Command-line calculator (*)
Write a program that reads a text representing a mathematical op
eration (one of the four basic ones) with two
operands, and then execute it.  For example, if the user enters “3
/5” the program outputs “0.6”; if the user
enters “23 * 4” the program outputs “92”.
*/

validSum = false
String[] operators = Arrays.asList("\\+", "-", "\\*", "/")
double inputOperand1
double inputOperand2

String userInput = args.join("")

if(!(args.size() == 1 || args.size() == 3)){
    println "The following arguments are not valid"
    for(String arg : args){
        println arg
    }
    validSum = true
}

while(!validSum){

    //println "userInput: " + userInput

    if(userInput == null || userInput == ""){
        print "Please enter your two operand, single operator sum: "
        userInput = System.console().readLine()
    }

    String[] sum = new String[1]
    String operator = ""

    int i = 0
    while(sum.size() != 2 && i < operators.size()){
        operator = operators[i]
        sum = userInput.split(operator)
        i++
    }

    if(sum.size() != 2){
        println "Please enter a valid sum"
    }
    else{
        try{
            inputOperand1 = Double.parseDouble(sum[0].trim())
            inputOperand2 = Double.parseDouble(sum[1].trim())

            Double[] numbers = new Double[2]
            numbers[0] = inputOperand1
            numbers[1] = inputOperand2

            println calculate(numbers, operator.replace("\\", ""))
            validSum = true
        }
        catch(NumberFormatException e){
            println "Your operands were not valid"
        }
    }

    userInput == null

}

def calculate(numbers, operator){

    double precision = 1E14

    if(numbers.size() < 1)
        return null

    double result = numbers[0]

    for(int i = 1; i < numbers.size(); i++) {
        switch(operator){
            case "+":
                result += numbers[i]
                break

            case "-":
                result -= numbers[i]
                break

            case "/":
                result /= numbers[i]
                break

            case "*":
                result *= numbers[i]
                break
        }
    }

    return Math.round(result * precision) / precision
}