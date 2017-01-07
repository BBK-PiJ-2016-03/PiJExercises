public class App{
    public static void main(String[] args){
        MyLinkedList<String> stringList = new DoubleLinkedList<>();


        stringList.add("E");
        stringList.add("DD");
        stringList.add("D");
        stringList.add("A");
        stringList.add("Z");
        stringList.add("Q");
        stringList.add("V");
        stringList.add("P");
        stringList.add("B");
        stringList.add("E");
        stringList.add("C");


        for (int i = 0; i < stringList.length(); i++){
            System.out.println(stringList.getElementAt(i));
        }

        MyLinkedList<Integer> intList = new DoubleLinkedList<>();
        intList.add(1);
        intList.add(90);
        intList.add(4);
        intList.add(3);
        intList.add(99);
        intList.add(8);
        intList.add(23);
        intList.add(54);
        intList.add(3);
        intList.add(12);
        intList.add(2);

        intList.remove(1);
        intList.remove(2);


        for (int i = 0; i < intList.length(); i++){
            System.out.println(intList.getElementAt(i));
        }
    }
}