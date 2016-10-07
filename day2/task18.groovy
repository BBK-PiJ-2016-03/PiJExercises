//calc pi
print "Please enter the number of digits you would like pi calculated to: "
String input = System.console().readLine()
try{
    int digits = Integer.parseInt(input)
    int rounding = Math.pow(10, digits)

    double pi = calulatePi(digits)
    println pi

    //println Math.round(pi*rounding)/rounding

}
catch(NumberFormatException e){
    println "You did not enter a valid number"
}

def calulatePi(n){

    double four = 4.0
    double pi = 4

    for(int i = 1; i < (n*4); i+=4){
        pi = pi - (four/i)
        pi = pi + (four/(i+2))
    }

    return pi
}