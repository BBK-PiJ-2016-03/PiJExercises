package Task07_Array_to_List;

import static Task07_Array_to_List.ArrayUtilities.arrayToList;
/**
 * Created by Alexander Worton on 07/01/2017.
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {4,7,23,2,1,3,2};

        IntegerLinkedList list = arrayToList(arr);
        list.removeAt(2);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
