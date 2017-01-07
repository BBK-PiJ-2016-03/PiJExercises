
int lowerRange = 0
int upperRange = 1000
int solution = Math.round(upperRange * Math.random())
String input = "";
int guess = 0;

println String.format("Try to guess my number between %s and %s!", lowerRange, upperRange)

int attempts = 1
while(guess != solution){
    print "Enter a number: "
    input = System.console().readLine()

    try{
        guess = Integer.parseInt(input)
        if(guess == solution){
            println "CORRECT!"
            String attemptText = attempts > 1 ? "attempts" : "attempt"
            println String.format("You needed %s %s", attempts, attemptText)
        }
        else{
            print "No! My number is "
            print guess < solution ? "Higher" : "Lower"
            print "\n"
            if(guess > 1000 || guess < 0)
                println String.format("Hint: try guessing between %s and %s!", lowerRange, upperRange)
        }
    }
    catch(NumberFormatException e){
        println "Hmm, I don't know what that was. Try typing a number."
    }

    attempts++

}
