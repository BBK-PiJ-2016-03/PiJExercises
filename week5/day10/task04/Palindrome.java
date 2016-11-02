public class Palindrome{
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        System.out.println(p.check(p.getWord()));
    }

    private String getWord(){
        return System.console.readLine();
    }

    private boolean check(String word){
        if(word.length() <= 1)
            return true;
        
        return word[0] == word[word.length()-1] && check(word.substring(1,word.length()-2));
    }
}