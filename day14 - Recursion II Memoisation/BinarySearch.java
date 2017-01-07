import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        BinarySearch bin = new BinarySearch();
        bin.start();
    }

    private void start(){
        List<Integer> sortedList = generateSortedList(20);
        int target = -3;
        String output = search(sortedList, target) ? "Target located" : "Target not found";
        System.out.println(output);    
    }

    private List<Integer> generateSortedList(int length){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= length; i++){
            list.add(i);
        }
        return list;
    }

    private boolean search(List<Integer> sortedList, int target){
        int midIndex = sortedList.size() / 2;
        int midElement = sortedList.get(midIndex);

        if(midElement == target) 
            return true;

        if(sortedList.size() == 1)
            return false;

        if(target < midElement){
            List<Integer> halfList = getLeftHalfOfList(sortedList, midIndex);
            return search(halfList, target);
        }
        
        List<Integer> halfList = getRightHalfOfList(sortedList,midIndex);
        return search(halfList, target);        
    }

    private List<Integer> getLeftHalfOfList(List<Integer> sortedList, int midIndex){
        return copyList(sortedList, 0, midIndex-1);
    }

    private List<Integer> getRightHalfOfList(List<Integer> sortedList, int midIndex){
        return copyList(sortedList, midIndex+1, sortedList.size()-1);
    }

    private List<Integer> copyList(List<Integer> sortedList, int from, int to){
        List<Integer> reducedList = new ArrayList<>();

        for(int i = from; i <= to; i++){
            reducedList.add(sortedList.get(i));
        }

        return reducedList;
    }
}