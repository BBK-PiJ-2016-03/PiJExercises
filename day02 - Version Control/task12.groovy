print "Please enter the size of the pyramid (1-9): "
String input = System.console().readLine()
int pyramidSize = 0
try{
    pyramidSize = Integer.parseInt(input)

    if(pyramidSize < 1 || pyramidSize > 9){
        println "The size of your pyramid is outside of the allowed range"
    }
    else{

        for(int i = 1; i <= pyramidSize; i++){
            for(int j = 0;j < i; j++){
                print i
            }
        print "\n"
        }
    }
}
catch(NumberFormatException e){
    println "You did not enter a number"
}


