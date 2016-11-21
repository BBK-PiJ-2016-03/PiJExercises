import java.util.*;

public class MergeSort<T extends Comparable<T>>{

    public List<T> sort(List<T> unsorted){

        //recursively split list until one element, then recombine
        if(unsorted.size() == 1)
            return unsorted;

        int midIndex = unsorted.size() / 2;

        List<T> leftHalf = getLeftHalfOfList(unsorted, midIndex);
        List<T> rightHalf = getRightHalfOfList(unsorted, midIndex);

        return merge(sort(leftHalf), sort(rightHalf));
    }

    private List<T> getLeftHalfOfList(List<T> list, int midIndex){
        return copyList(list, 0, midIndex);
    }

    private List<T> getRightHalfOfList(List<T> list, int midIndex){
        return copyList(list, midIndex+1, list.size()-1);
    }

    private List<T> merge(List<T> left, List<T> right){
        int leftIndex = 0;
        int rightIndex = 0;

        List<T> mergedList = new ArrayList<>();

        while(leftIndex < left.size() || rightIndex < right.size()){
            if(left.get(leftIndex).compareTo(right.get(rightIndex)) >= 0 && leftIndex < left.size()){
                mergedList.add(left.get(leftIndex));
                leftIndex++;
            }
            else if(rightIndex < right.size()){
                mergedList.add(right.get(rightIndex));
                rightIndex++;
            }    
            else{
                break;
            }
        }
        return mergedList;
    }

    private List<T> copyList(List<T> list, int from, int to){
        List<T> reducedList = new ArrayList<>();

        for(int i = from; i <= to; i++){
            reducedList.add(list.get(i));
        }

        return reducedList;
    }
}