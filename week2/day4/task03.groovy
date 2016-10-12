/* 3  Binary and decimal */

def power(int base, int exponent){
    int result = base;

    for(int i = 1; i < exponent; i++){
        result *= base;
    }

    return result;
}

def power2(int exponent){
    return power(2, exponent);
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

int exponent = getExponentFromUser()
println power2(exponent)