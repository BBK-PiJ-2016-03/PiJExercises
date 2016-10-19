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

    //this is not optimised, you don't have to examine all the positions, only half of them.
    private boolean check2dSymmetryOnRow(int[][] arr, int row){
        boolean symmetric = true;
        for(int col = 0; col < arr[row].length; col++){
            symmetric = check2dSymmetry(arr, col, row);
            if(symmetric == false)
                break;
        }
        return symmetric;
    }

    private boolean check2dSymmetry(int[][] arr, int col, int row){
        if(arr[row][col] == arr[col][row]){
            return true;
        }
        return false;
    }

    //continue from HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public boolean isSymmetrical(int[][] arr){
        //m[i][j] == m[j][i]
        boolean symmetrical = true;

        for(int row = 0; row < arr.length; row++){
            symmetrical = check2dSymmetryOnRow(arr, row);
        }

        return symmetrical;
    }

    public boolean isTriangular(int[][] arr){
        //m[i][j] == 0 for any value of i that is greater than j.
        boolean symmetrical = true;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] != arr[col][row]){
                    symmetrical = false;
                    break;
                }
            }
        }

        return false;
    }
}