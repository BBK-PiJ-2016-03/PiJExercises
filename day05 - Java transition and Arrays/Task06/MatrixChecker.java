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

            if(!symmetric)
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

    public boolean isSymmetrical(int[][] arr){
        //m[i][j] == m[j][i]
        boolean symmetric = true;
        for(int row = 0; row < arr.length; row++){

            symmetric = check2dSymmetryOnRow(arr, row);

            if(!symmetric)
                break;
        }

        return symmetric;
    }

    public boolean isTriangular(int[][] arr){
        //m[i][j] == 0 for any value of i that is greater than j.
        boolean triangular = true;
        for(int row = 0; row < arr.length; row++){
            triangular = checkTriangularRow(arr, row);

            if(!triangular)
                break;
        }

        return triangular;
    }

    private boolean checkTriangularRow(int[][] arr, int row){
        boolean triangular = true;
        for(int col = 0; col < arr[row].length; col++){

            triangular = checkTriangular(arr, row, col);

            if(!triangular)
                break;
        }
        return triangular;
    }

    private boolean checkTriangular(int[][] arr, int row, int col){
        if(row > col && arr[row][col] != 0){
            return false;
        }
        return true;
    }
}