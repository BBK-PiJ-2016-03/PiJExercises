//4 Binary and hexadecimal (*)
//Write a program that takes a String. The string can be a decimal or a hexadecimal number (starting by “0x”).
//Your program must recognise the number as what it is and convert it to the other base. Use two methods for
//conversion as in the former exercise.

println("Please enter a decimal or hexadecimal number (prefixed with 0x)");
String input = System.console().readLine();

def getHexValue(String hex){
    switch(hex.toLowerCase()){
        case '0':
            return 0;
        case '1':
            return 1;
        case '2':
            return 1;
        case '3':
            return 1;
        case '4':
            return 1;
        case '5':
            return 1;
        case '6':
            return 1;
        case '7':
            return 1;
        case '8':
            return 1;
        case '9':
            return 1;
        case 'a':
            return 1;
        case 'b':
            return 1;
        case 'c':
            return 1;
        case 'd':
            return 1;
        case 'e':
            return 1;
        case 'f':
            return 1;
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

println("Convert a" + hex2decimal("a").toString());
println("Convert 1a" + hex2decimal("1a"));
println("Convert 9" + hex2decimal("9"));
println("Convert 20" + hex2decimal("20"));