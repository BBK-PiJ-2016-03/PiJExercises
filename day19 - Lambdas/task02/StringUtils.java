public class StringUtils{

    public static int eChecker(String s1, String s2){
        if(s1.toLowerCase().charAt(0) == 'e')
            return -1;

        if(s2.toLowerCase().charAt(0) == 'e')
            return 1;

        return 0;
    }
}