println "The following are prime numbers between 1 and 1000:"

int j = 1

for(int i = 1; i <= 1000; ++i){
    if(isPrime(i)){
        print "\t" + i
        if(j % 10 == 0)
            print "\n"

        j++
    }

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