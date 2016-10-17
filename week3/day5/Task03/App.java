public class App{
    public static void main(String[] args){

        Matrix matrix = new Matrix(3,5);

        matrix.setRow(1, "1,2,3,4,5");

        printArray(matrix.getRow(1));

    }

    private static void printArray(int[] arr, String label){
        System.out.print(label);
        for(int value : arr){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}