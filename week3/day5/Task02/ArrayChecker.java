public class ArrayChecker{
    public static void main(String[] args){
        ArrayChecker ac = new ArrayChecker();
        int[] arr = new int[]{1,2,3,4,5,4,3,2,1};
        System.out.println("Symmetrical (true): " + ac.isSymetrical(arr));

        int[] arr2 = new int[]{1,1,2,3,4,5,4,3,2,1};
        System.out.println("Symmetrical (false): " + ac.isSymetrical(arr2));
    }

    private boolean isSymetrical(int[] arr){   

        if(arr.length < 2)
            return true;

        if(arr.length == 2)
            return arr[0] == arr[1];

        if(arr[0] != arr[arr.length - 1]){
            return false;
        }

        return isSymetrical(copy(arr, 1, arr.length - 2));
    }

    private int[] reverse(int[] arr){
        return new int[0];
    }

    public int[] copy(int[] source, int startIndex, int endIndex){

        int size = endIndex - startIndex + 1;

        if(size < 1 || size > source.length)
            return null;
        
        int[] destination = new int[size];

        int j = 0;
        for(int i = startIndex; i < destination.length; i++){
            destination[j] = source[i];
            j++;
        }

        return destination;
    }
}