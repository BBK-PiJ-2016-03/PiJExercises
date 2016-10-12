/*10  Counting pairs of letters (*)
Write a program that reads a short string and then some longer text. The program must say how many times you
can find the short string in the text. You cannot use any method of String apart from charAt() and length(). */

print "Please enter some text: "
String userText = System.console().readLine()

print "Please enter the text you would like to count occurence of: "
String searchText = System.console().readLine()



println "In [" + userText + "]"
println "There are " + countTextOccurence(userText, target) + " instances of " + target


def countTextOccurence(String text, String target){
    boolean match
    int targetLength = target.length()
    int matchChar = 0
    int count = 0;
    for(char character : text){
        if(targetCharacter == target[matchChar]){
            if(matchChar == targetLength-1){
                match = false
                matchChar = 0
                count++
            }
            else{
                match = true
                matchChar++
            }
        }
        else{
            match = false
            matchChar = 0
        }
    }

    return count
}