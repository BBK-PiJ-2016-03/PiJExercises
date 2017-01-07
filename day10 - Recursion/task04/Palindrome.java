public class Palindrome{
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        while(true){
            System.out.println(p.check(p.getWord()));
        }
        
    }

    private String getWord(){
        System.out.print("Please enter a word to check if it is a palindrome: ");
        return System.console().readLine();
    }

    private boolean check(String word){
        if(word.length() <= 1)
            return true;
        
        int lastCharIndex = word.length()-1;
        return word.charAt(0) == word.charAt(lastCharIndex) && check(word.substring(1,lastCharIndex));
    }
}