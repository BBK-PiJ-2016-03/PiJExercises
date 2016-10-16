//4 Binary and hexadecimal (*)
//Write a program that takes a String. The string can be a decimal or a hexadecimal number (starting by “0x”).
//Your program must recognise the number as what it is and convert it to the other base. Use two methods for
//conversion as in the former exercise.

println("Please enter a decimal or hexadecimal number (prefixed with 0x)");
String input = System.console().readLine();

println("Length: "+input.length());

if(input.length() >= 2 && input[0] == "0" && input[1].toLowerCase() == "x"){
    println("Hex: "+input.substring(2));
}
else{
    println("Decimal: "+input)
}
println()

def getHexValue(String hex){
    switch(hex.toLowerCase()){
        case '0':
            return 0;
        case '1':
            return 1;
        case '2':
            return 2;
        case '3':
            return 3;
        case '4':
            return 4;
        case '5':
            return 5;
        case '6':
            return 6;
        case '7':
            return 7;
        case '8':
            return 8;
        case '9':
            return 9;
        case 'a':
            return 10;
        case 'b':
            return 11;
        case 'c':
            return 12;
        case 'd':
            return 13;
        case 'e':
            return 14;
        case 'f':
            return 15;
        default:
            throw new NumberFormatException();

    }
}

def hex2decimal(String hex){

    int powerVal = hex.length() - 1;
    int decimal = 0;

    for(String value : hex){
        decimal += power(16, powerVal) * getHexValue(value);

        powerVal--;
    }

    return decimal;

}

def decimal2binary(int decimal){
    String binary = "";

    while(decimal > 0){
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal = decimal/2;
    }

    return binary;
}

def binary2decimal(String binary){

    int power = binary.length() - 1;
    int decimal = 0;

    for(char value : binary){
        if(!isValidBase2Char(value)){
            throw new NumberFormatException("Number provided was not base 2");
        }
        else if(value == '1'){
            decimal += power2(power);
        }

        power--;
    }

    return decimal;
}

def power(int base, int exponent){
    int result = 1;

    for(int i = 0; i < exponent; i++){
        result *= base;
    }

    return result;
}

println("Convert a");
println(hex2decimal("a"));
println("Convert 1a");
println(hex2decimal("1a"));
println("Convert 9");
println(hex2decimal("9"));
println("Convert 20");
println(hex2decimal("20"));