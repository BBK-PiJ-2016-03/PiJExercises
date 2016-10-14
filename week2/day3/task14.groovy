// 14 Palindrome creator

println("Palindrome creator");
print("Please enter your text: ");
String words = System.console().readLine();
String wordsReversed = reverse(words);

println("Your palindrome is: " + words+wordsReversed)

def reverse(String words){
    String reversed = "";
    for(int i = words.length() - 1; i >= 0; i--){
        reversed += words[i]
    }
    return reversed
}