import java.util.*;

public class QuickSort<T extends Comparable<T>>{

    public List<T> sort(List<T> unsorted){

        if(unsorted.size() <= 1)
            return unsorted;

        T pivot = unsorted.get(0);

        List<T> beforePivot = new ArrayList<T>();
        List<T> afterPivot = new ArrayList<T>();

        for(int i = 1; i < unsorted.size(); i++){
            if(unsorted.get(i).compareTo(pivot) < 0){
                beforePivot.add(unsorted.get(i));
            }
            else{
                afterPivot.add(unsorted.get(i));
            }
        }
        return concatenate(sort(beforePivot), pivot, sort(afterPivot));
    }

    private List<T> concatenate(List<T> beforePivot, T pivot, List<T> afterPivot){

        beforePivot.add(pivot);

        for(T element : afterPivot){
            beforePivot.add(element);
        }
        //will we get weirdness since we are using a reference type?
        return beforePivot;
    }
}