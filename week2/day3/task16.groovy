/*16  Text2number
Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a number that is half of it. Do not use Double.parseDouble().
If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.*/

println("Please enter a number with commas and decimal point: ");
String input = System.console().readLine();

double number = parseNumber(stripCommas(input));
println("your number: " + number);
println("Your number / 2: " + (number / 2));

def parseNumber(String input){
    int decimalPointPosition = input.indexOf(".");
    double columnValue = 1;
    double output = 0;

    if(decimalPointPosition > 0){
        int reduction = (input.length() - decimalPointPosition -1);
        for(int i = reduction; i>0; i--){
            columnValue /= 10;
        }
    }

    for(int i = input.length()-1; i >= 0; i--){
        if(input[i] != '.'){
            output += Integer.parseInt(input[i]) * columnValue;
            columnValue *= 10;
        }
    }

    return output;
}

def stripCommas(String input){
    return input.replace(",", "");
}