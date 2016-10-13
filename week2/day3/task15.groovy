//15 Palindrome redux (*)

println("Palindrome checker");
print("Please enter your text: ");
String words = System.console().readLine();
words = stripPunctuation(words);
String wordsReversed = reverse(words);


String response = (words == wordsReversed) ? "is" : "is not";

println("[" + words + "] " + response + " a palindrome");



def reverse(String words){
    String reversed = "";
    for(int i = words.length() - 1; i >= 0; i--){
        reversed += words[i];
    }
    return reversed;
}

def stripPunctuation(String input){
    String output = "";
    for(char character in input){
        if(Character.isLetter(character)){
            output += Character.toLowerCase(character);
        }
    }
    return output;
}