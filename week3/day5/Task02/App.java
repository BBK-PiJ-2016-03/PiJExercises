public class App{
    public static void main(String[] args){
        int[] source = {9,4,67,54,2,345,2,5};
        int[] arr8 = new int[8];
        int[] arr12 = new int[12];
        int[] arr5 = new int[5];

        printArray(source, "Source: ");

        ArrayCopier copier = new ArrayCopier();

        //Both arrays are of the same size.
        int[] copied1 = copier.copy(source, arr8);
        printArray(copied1, "Copied, same size: ");

        // The source array is longer.
        int[] copied2 = copier.copy(source, arr5);
        printArray(copied2, "Copied, source longer: ");

        //The source array is shorter.
        int[] copied3 = copier.copy(source, arr12);
        printArray(copied3, "Copied, source shorter: ");


    }

    private static void printArray(int[] arr, String label){
        for(int value : arr){
            System.out.print(label + value + ", ");
        }
    }
}