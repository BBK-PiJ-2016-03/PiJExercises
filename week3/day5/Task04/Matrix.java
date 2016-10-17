//4 One-liners for matrices (*)
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

    public void setMatrix(String values){
        values = values.replace("[", "");
        values = values.replace("]", "");
        String[] rowsData = getRowData(values);

        for(String rowData in rowsData){
            setRow(rowData);
        }
    }

    private String[] getRowData(String values){
        vals = vals.replace(" ", "");
        return vals.split(";");
    }

    @Override
    public String toString(){
        String output = "[";

        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[i].length; j++){
                if(j > 0)
                    output += ",";
                output += this.matrix[i][j];
            }
            if(i < this.matrix.length - 1)
                output += ";";
        }
        output += "]";
        return output;
    }

    public String prettyPrint(){
        String output = "";
        for(int[] row : this.matrix){
            for(int i = 0; i < row.length; i++){
                if(i > 0)
                    output += ", ";
                output += row[i];
            }
            output += "\n";
        }
        return output;
    }
}