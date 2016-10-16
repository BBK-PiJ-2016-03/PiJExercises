/* 3  Binary and decimal */

def power(int base, int exponent){
    int result = 1;

    for(int i = 0; i < exponent; i++){
        result *= base;
    }

    return result;
}

def power2(int exponent){
    return power(2, exponent);
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

def boolean isValidBase2Char(char character){
    if(character == '0' || character == '1'){
        return true;
    }
    return false;
}


def decimal2binary(int decimal){
    String binary = "";

    while(decimal >= 0){
        int remainder = decimal % 2;
        binary = remainder + binary;
        decimal = Math.floor(decimal/2);
    }

    return binary;
}

def getExponentFromUser(){
    Integer exponent = null;
    boolean validInput = false;
    while(!validInput){

         println("Please enter an exponent");
         String userExponent = System.console().readLine();

         try{
            exponent = Integer.parseInt(userExponent);
            validInput = true;
         }
         catch(NumberFormatException e){
            validInput = false;
            println("There was an error parsing your input. Please enter a valid integer.");
         }
    }

    return exponent
}

//int exponent = getExponentFromUser()
//println power2(exponent)

//println binary2decimal("100001")
print("converting 8 : ");
println(decimal2binary(8));
print("converting 4 : ");
println(decimal2binary(4));
print("converting 3 : ");
println(decimal2binary(3));