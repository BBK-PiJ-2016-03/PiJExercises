/*17  Optimus Prime (**)
Write a program that reads an integer number from the user, and then outputs the closest prime number. If there
are two prime numbers at the same distance, it should output both. For instance, if the user enters 5116, the output
should be 5113 and 5119. */

print "Please enter a number: "
String userInput = System.console().readLine()
int userNumber
try{
    userNumber = Integer.parseInt(userInput)

    if(isPrime(userNumber)){
        return userNumber + "is a Prime number"
    }
    else{
        boolean foundPrime = false
        int i = 1
        int numberOfClosestPrimes = 0
        while(!foundPrime){

            if(isPrime(userNumber + i)){
                foundPrime = true
                numberOfClosestPrimes++
                print (userNumber + i)
            }

            if(isPrime(userNumber - i)){
                foundPrime = true
                numberOfClosestPrimes++
                if(numberOfClosestPrimes == 2)
                    print " and "

                print (userNumber + i)
            }


            if(foundPrime){
                if(numberOfClosestPrimes > 1){
                    print " are the closest primes to " + userNumber
                }
                else{
                    print " is the closest prime to " + userNumber
                }
            }

            i++
        }
    }

}
catch(NumberFormatException e){
    println "You did not enter a valid number"
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