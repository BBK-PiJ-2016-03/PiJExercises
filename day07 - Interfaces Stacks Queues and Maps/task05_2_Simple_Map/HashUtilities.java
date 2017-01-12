package task05_2_Simple_Map;

public class HashUtilities{
    public static int shortHash(int hash){
        return Math.abs(hash) % 1000;
    }
}