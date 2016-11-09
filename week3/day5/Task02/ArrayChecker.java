public class ArrayChecker{
    public static void main(String[] args){
        ArrayChecker ac = new ArrayChecker();
        System.out.println("Symmetrical: " + ac.isSymetrical());
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
    }
}