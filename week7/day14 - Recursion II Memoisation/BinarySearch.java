import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        BinarySearch bin = new BinarySearch();
        bin.start();
    }

    private void start(){
        List sortedList = generateSortedList();
        bin.search();
    }

    private List generateSortedList(int length){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < length; i++){
            list.add(i);
        }
        return list;
    }

    private void search(List sortedList){

    }
}