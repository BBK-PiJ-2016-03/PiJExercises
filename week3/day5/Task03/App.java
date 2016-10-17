public class App{
    public static void main(String[] args){

        Matrix matrix = new Matrix(3,5);

        for(int i = 0; i < matrix.matrix.length; i++){
            printArray(matrix.matrix[i], "Array "+i+ ": ");
        }
    }

    private static void printArray(int[] arr, String label){
        System.out.print(label);
        for(int value : arr){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}