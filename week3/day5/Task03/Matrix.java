public class Matrix{
    int[][] matrix;

    public Matrix(int a, int b){
        matrix = new int[a][b];
        for(int i = 0; i < matrix.length){
            for(int j = 0 ; j < matrix[i][j].length; j++){
                matrix[i][j] = 1;
            }
        }
    }
}