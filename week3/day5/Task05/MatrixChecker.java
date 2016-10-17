public class MatrixChecker{

    public boolean isSymmetrical(int[] arr){
        int position = 0;
        boolean symmetrical = true;

        while(position < arr.length - (position+1)){
            symmetrical = check1dSymmetry(arr, position);

            if(!symmetrical)
                break;

            position++;
        }

        return symmetrical;
    }

    private boolean check1dSymmetry(int[] arr, int position){
        if(arr[position] == arr[arr.length - (position+1)]){
            return true;
        }
        return false;
    }

    private boolean check2dSymmetry(int[][] arr, int rowPosition){
        for(int column = 0; column < arr[row]; i++){
                if(arr[row][column] != arr[column][row]){
                    symmetrical = false;
                    break;
                }
            }
    }

    //continue from HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public boolean isSymmetrical(int[][] arr){
        //m[i][j] == m[j][i]
        boolean symmetrical = true;

        for(int row = 0; row < arr.length; i++){
            symmetrical = check2dSymmetry(arr, row);
        }

        return symmetrical;
    }

    public boolean isTriangular(int[][] arr){
        //m[i][j] == 0 for any value of i that is greater than j.
        boolean symmetrical = true;

        for(int row = 0; row < arr.length; i++){
            for(int column = 0; column < arr[row]; i++){
                if(arr[row][column] != arr[column][row]){
                    symmetrical = false;
                    break;
                }
            }
        }

        return false;
    }
}