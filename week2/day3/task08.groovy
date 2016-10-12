/* 8  Line to column
Write a program that reads some text from the user and then writes the same text on screen, but each letter on a
different line. Now modify your program to write each word (as defined by spaces) rather than letter on a different line. */

print "Please enter some text: "
String userInput = System.console().readLine()
//outputEachCharacterOnNewLine(userInput)
outputEachWordOnNewLine(userInput)


def outputEachCharacterOnNewLine(String text){
    for(char character : text){
        println character
    }
}

def outputEachWordOnNewLine(String text){
    for(char character : text){
        if(character == ' '){
            print "\n"
        }
        else{
            print character
        }

    }
}