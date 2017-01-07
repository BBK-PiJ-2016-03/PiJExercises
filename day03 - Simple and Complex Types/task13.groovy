//13 Palindrome

println("Palindrome checker");
print("Please enter your text: ");
String words = System.console().readLine();
String wordsReversed = reverse(words);


String response = (words == wordsReversed) ? "is" : "is not";

println("[" + words + "] " + response + " a palindrome");



def reverse(String words){
    String reversed = "";
    for(int i = words.length() - 1; i >= 0; i--){
        reversed += words[i]
    }
    return reversed
}
