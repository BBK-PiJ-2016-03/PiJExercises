package Task07_Array_to_List;

public class ArrayUtilities{

    public static IntegerLinkedList arrayToList(int[] arr){
        IntegerLinkedList list = new IntegerLinkedList();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        return list;
    }
}