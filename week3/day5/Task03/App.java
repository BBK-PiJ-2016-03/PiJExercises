public class App{
    public static void main(String[] args){

        Matrix matrix = new Matrix(3,5);

        matrix.setColumn(1, "1,2,3,4,5");

        matrix.setRow(1, "1,2,3,4,5");

        System.out.println(matrix.toString());
        /*
        for(int[] row : matrix.matrix){
            printArray(row, "");
        }
        */


    }

    private static void printArray(int[] arr, String label){
        System.out.print(label);
        for(int value : arr){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}