print "Please enter some text: "
String userText = System.console().readLine()

List<String> characters = new ArrayList<>()
String userCharacter = ""
boolean run = true

while(run){
    print "Please enter the character you would like to count (e): "
    userCharacter = System.console().readLine()

    if(userCharacter == "" || userCharacter == null)
    userCharacter = "e"

    String target = userCharacter[0]

    if(characters.contains(target)){
        println "You have already searched for ["+target+"]"
        run = false
        break
    }

    println "In [" + userText + "]"
    println "There are " + countCharacterOccurence(target, userText) + " instances of " + target

    userCharacter = target
    characters.add(userCharacter)
}


def countCharacterOccurence(String targetCharacter, String text){
    int count = 0;
    for(String character : text){
        if(targetCharacter == character)
            count++
    }

    return count
}