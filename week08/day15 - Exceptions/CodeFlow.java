 import java.util.*;
 
 public class CodeFlow{

    public static void main(String[] args){
        CodeFlow cf = new CodeFlow();

        System.out.println("input: 0");
        cf.launch(0);

        System.out.println();
        System.out.println("input: 2");
        cf.launch(2);

        System.out.println();
        System.out.println("input: 4");
        cf.launch(4);

        System.out.println();
        System.out.println("input: 6");
        cf.launch(6);
    }

    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } 
        catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}