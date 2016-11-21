//problem with original code is that the first catch is broader, so NullPointerException will be caught in first block
import java.util.*;
public class Exception{
    public static void main(String[] args){
        List<String> list = null;
        try {
            // more code here
            String newElement = "Bluuurgh!";
            list.add(5, newElement);
            // more code here
        } 
        catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        catch (RuntimeException ex) {
            ex.printStackTrace();
            System.out.println("Here");
        } 
    }
}