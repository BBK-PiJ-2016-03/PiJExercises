import java.util.*;

public class MergeSort<T extends Comparable<T>>{

    public List<T> sort(List<T> unsorted){

        //recursively split list until one element, then recombine
        if(unsorted.size() == 1)
            return unsorted;

        int midIndex = unsorted.size() / 2;

        List<T> leftHalf = getLeftHalfOfList(unsorted);
        List<T> rightHalf = getRightHalfOfList(unsorted);

        return merge(sort(leftHalf), sort(rightHalf));
    }

    private List<T> getLeftHalfOfList(List<T> list, int midIndex){
        return copyList(list, 0, midIndex);
    }

    private List<T> getRightHalfOfList(List<T> list, int midIndex){
        return copyList(list, midIndex+1, list.size()-1);
    }

    private List<T> copyList(List<T> list, int from, int to){
        List<T> reducedList = new ArrayList<>();

        for(int i = from; i <= to; i++){
            reducedList.add(list.get(i));
        }

        return reducedList;
    }
}