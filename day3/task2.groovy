/*
Write a program that reads two numbers from the user and then off
ers a menu with the four basic operations:
addition, subtraction, multiplication, and division. Once the user has
selected an operation from the menu, the
calculator performs the operation.
Hint:  In the same way that there exists an Integer.parseInt() me
thod to parse integers, there is a Dou-
ble.parseDouble() method to parse real numbers.
*/

enum Operators{
    +,-,/,*
}

List<double> numbers = new ArrayList<double>()

numbers = readNumbers()
operator = readOperator()
calculate(numbers, )


def readNumbers(){

    List<double> inputNumbers = new ArrayList<double>()
    String[] output = new String[2]{"first","second"}

    for(int i = 0; i < output.size(); i++)
        println String.format("Please enter your %s number", order)
        String input = System.console().readLine()
        try{
            double number = Double.parseDouble(input)
            inputNumbers.add(number)
        }
        catch(NumberFormatException e){
            println "Your number could not be parsed. Please try again"
            i--
        }
    }
    return inputNumbers
}

def readOperator(){
    println "Please choose an operator from the list"
    for(Operators op : Operators.values()){
        println "\t"+op.name()
    }

    Operators operator = null

    while(operator == null){
        try{
            String userInput = System.console().readLine()
            operator = Operators.valueOf(userInput)
        }
        catch(ArrayIndexOutOfBoundsException e){
            println "That was not a vlaid entry, please try again"
        }
    }

    return operator
}

def calculate(numbers, operator){

    if(numbers.size() < 1)
        return null

    double result = numbers[0]

    for(int i = 1; i < numbers.size()-1; i++) {
        switch(operator){
            case Operators.+:
                result += numbers[i]
                break

            case Operators.-:
                result -= numbers[i]
                break

            case Operators./:
                result /= numbers[i]
                break

            case Operators.*:
                result *= numbers[i]
                break
        }
    }

    return result
}