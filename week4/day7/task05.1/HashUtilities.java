public class HashUtilities{
    public static int shortHash(int hash){
        return 1000 % Math.abs(hash);
    }
}