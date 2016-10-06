//calc pi
print "Please enter the number of digits you would like pi calculated to: "
String input = System.console().readLine()
try{
    int digits = Integer.parseInt(input)
    int rounding = Math.pow(10, digits)

    double pi = calulatePi(2)
    double poo = 4
    poo -= 4/3
    poo += 4/7
    println poo
    println pi

    //println Math.round(pi*rounding)/rounding

}
catch(NumberFormatException e){
    println "You did not enter a valid number"
}

def calulatePi(n){

    int i = 0
    double pi = 4
    int prime = 3
    String pii = "4"

    while(i < n){
        prime = nextPrime(prime)
        if(i % 2 == 0){
            pi = pi - (4/prime)
            pii+="-(4/"+prime+")"
        }
        else{
            pi = pi + (4/prime)
            pii+="+(4/"+prime+")"
        }

        prime++
        i++
    }
    println pii
    return pi

}

def nextPrime(number){
    while(!isPrime(number)){
        number++
    }
    return number
}


def isPrime(number){
    //a prime number can only be divided without remainder by itself and one
    boolean prime = true;
    for(int i = 2; i < number; i++){
        if(number % i == 0){
            prime = false
            break
        }
    }
    return prime
}