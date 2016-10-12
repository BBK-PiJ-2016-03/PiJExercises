/* 9  Counting letters
Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.
Then modify the program so that it reads the text from the user an d then asks for a letter.
The program should then say how many times you can find the letter in the text. */

print "Please enter some text: "
String userText = System.console().readLine()

print "Please enter the character you would like to count (e): "
String userCharacter = System.console().readLine()

if(userCharacter == "" || userCharacter == null)
    userCharacter = "e"

char target = userCharacter[0]

println "In [" + userText + "]"
println "There are " + countCharacterOccurence(target, userText) + " instances of " + target


def countCharacterOccurence(char targetCharacter, String text){
    int count = 0;
    for(char character : text){
        if(targetCharacter == character)
            count++
    }
}