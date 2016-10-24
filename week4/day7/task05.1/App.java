public class App{
    public static void main(String[] args){

        String input = "";
        while(input != "q" && input != "quit"){
            System.out.println("Give me a string and I will calculate its hash code (q to quit)");
            String str = System.console().readLine();
            int hash = str.hashCode();
            int smallHash = HashUtilities.shortHash(hash);
            System.out.println("0 < " + smallHash + " < 1000");
        }

    }
}