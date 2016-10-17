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
        //m[i][j] == m[j][i]
        boolean symmetrical = true;

        for(int row = 0; row < arr.length; i++){
            for(int column = 0; column < arr[row]; i++){
                if(arr[row][column] != arr[column][row]){
                    symmetrical = false;
                    break;
                }
            }
        }

        return symmetrical;
    }

    public boolean isTriangular(int[][] arr){
        //m[i][j] == 0 for any value of i that is greater than j.

        return false;
    }
}