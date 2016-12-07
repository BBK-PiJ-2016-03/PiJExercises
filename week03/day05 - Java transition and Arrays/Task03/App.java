public class App{
    public static void main(String[] args){
        int[] source = {9,4,67,54,2,345,2,5};
        int[] arr8 = new int[8];
        int[] arr12 = new int[12];
        int[] arr5 = new int[5];

        printArray(source, "Source: ");

        ArrayCopier copier = new ArrayCopier();

        //Both arrays are of the same size.
        copier.copy(source, arr8);
        printArray(arr8, "Copied, same size: ");

        // The source array is longer.
        copier.copy(source, arr5);
        printArray(arr5, "Copied, source longer: ");

        //The source array is shorter.
        copier.copy(source, arr12);
        printArray(arr12, "Copied, source shorter: ");


    }

    private static void printArray(int[] arr, String label){
        System.out.print(label);
        for(int value : arr){
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}