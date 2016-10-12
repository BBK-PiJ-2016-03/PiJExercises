print "Please enter some text: "
String userText = System.console().readLine()

List<char> characters = new ArrayList<>()
String userCharacter = ""

while(!characters.contains(userCharacter)){
    print "Please enter the character you would like to count (e): "
    userCharacter = System.console().readLine()

    if(userCharacter == "" || userCharacter == null)
    userCharacter = "e"

    char target = userCharacter[0]

    println "In [" + userText + "]"
    println "There are " + countCharacterOccurence(target, userText) + " instances of " + target
}


def countCharacterOccurence(char targetCharacter, String text){
    int count = 0;
    for(char character : text){
        if(targetCharacter == character)
            count++
    }

    return count
}