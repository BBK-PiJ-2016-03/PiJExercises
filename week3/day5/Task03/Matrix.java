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

    public void setElement(int row,int column,int value){
        matrix[row][column] = value;
    }

    public void setRow(int row, String values){
        int[] valuesArray = getValuesFromString(values);

        int i = 0;
        for(int val : valuesArray){
            if(matrix[row].length > i){
                matrix[row][i] = val;
            }
            i++;
        }
    }

    public void setColumn(int column, String values){
        int[] valuesArray = getValuesFromString(values);

        int i = 0;
        for(int val : valuesArray){
            if(matrix.length > i){
                matrix[i][column] = val;
            }
            i++;
        }
    }

    public int[] getRow(int row){
        return matrix[row];
    }

    public int[] getColumn(int column){
        int[] columnValues = new int[matrix.length];
        int i = 0;
        for(int[] row : matrix){
            columnValues[i] = row[i];
            i++;
        }
        return columnValues;
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