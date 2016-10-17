public class Matrix{
    public int[][] matrix;

    public Matrix(int a, int b){
        matrix = new int[a][b];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 1;
            }
        }
    }
}