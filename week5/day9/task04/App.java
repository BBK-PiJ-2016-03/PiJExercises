public class App{
    public static void main(String[] args){
        MyLinkedList<String> stringList = new DoubleLinkedList<>();
        stringList.add("Four");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        stringList.add("Two");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        stringList.add("Three");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        stringList.add("One");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));
        stringList.add("Five");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));

        stringList.remove("Three");
        System.out.println("Length: " + stringList.length());
        System.out.println("First: " + stringList.getElementAt(0));

        System.out.println("First: " + stringList.getElementAt(0));
        System.out.println("Length: " + stringList.length());

        for (int i = 0; i < stringList.length(); i++){
            System.out.println(stringList.getElementAt(i));
        }

        MyLinkedList<Integer> intList = new DoubleLinkedList<>();
        intList.add(1);
        intList.add(5);
        intList.add(4);
        intList.add(3);
        intList.add(2);

        intList.remove(1);

        System.out.println("First: " + intList.getElementAt(0));
        System.out.println("Length: " + intList.length());

        for (int i = 0; i < intList.length(); i++){
            System.out.println(intList.getElementAt(i));
        }
    }
}