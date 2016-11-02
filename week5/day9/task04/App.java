public class App{
    public static void main(String[] args){
        MyLinkedList<String> stringList = new DoubleLinkedList<>();
        System.out.println("----------\nAdd E: ");
        stringList.add("E");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("----------\nAdd D: ");
        stringList.add("D");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("----------\nAdd C: ");
        stringList.add("C");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("----------\nAdd A: ");
        stringList.add("A");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("----------\nAdd B: ");
        stringList.add("B");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));

        System.out.println("----------\nRemove Three: ");
        stringList.remove("Three");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));

        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("Length: " + stringList.length());

        for (int i = 0; i < stringList.length(); i++){
            System.out.println(stringList.getElementAt(i));
        }

        MyLinkedList<Integer> intList = new DoubleLinkedList<>();
        System.out.println("----------\nAdd 1: ");
        intList.add(1);
        System.out.println("----------\nAdd 5: ");
        intList.add(5);
        System.out.println("----------\nAdd 4: ");
        intList.add(4);
        System.out.println("----------\nAdd 3: ");
        intList.add(3);
        System.out.println("----------\nAdd 2: ");
        intList.add(2);

        System.out.println("----------\nRemove 2: ");
        intList.remove(2);

        System.out.println("First: " + intList.getElementAt(0));
        System.out.println("Length: " + intList.length());

        for (int i = 0; i < intList.length(); i++){
            System.out.println(intList.getElementAt(i));
        }
    }
}