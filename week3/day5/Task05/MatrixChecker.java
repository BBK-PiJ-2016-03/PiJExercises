public class MatrixChecker{
    public boolean isSymmetrical(int[] arr){
        int position = 0;
        boolean symmetrical = true;
        while(position < arr.length - (position+1)){
            if(arr[position] != arr[arr.length - (position+1)]){
                symmetrical = false;
                break;
            }

            position++;
        }

        return symmetrical;
    }

    public boolean isSymmetrical(int[][] arr){
        return false;
    }

    public boolean isTriangular(int[][] arr){
        return false;
    }
}