public class Matrix{
    public int[][] matrix;

    public Matrix(int rows, int columns){
        matrix = new int[rows][columns];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 1;
            }
        }
    }

    public void setElement(int rows,int bcolumns,int value){
        matrix[a][b] = value;
    }

    public void setRow(int row, String values){
        int[] values = getValuesFromString(values);

        int i = 0;
        for(int val : values){
            if(matrix[row].length > i){
                matrix[row][i] = val;
            }
            i++;
        }
    }

    public int[] getRow(int row){
        return matrix[row];
    }

    private int[] getValuesFromString(String vals){
        vals = vals.replace(" ", "");
        String[] values = vals.split(",");
        int[] integerValues = new int[values.length];

        int i = 0;
        for(String val : values){
            integerValues[i] = Integer.parseInt(val);
            i++;
        }

        return integerValues;
    }
}