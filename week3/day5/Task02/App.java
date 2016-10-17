public class App{
    public static void main(String[] args){
        int[] source = {9,4,67,54,2,345,2,5};
        int[] arr8 = new int[8];
        int[] arr12 = new int[12];
        int[] arr5 = new int[5];

        printArray(arr = source, label = "Source: ");

        ArrayCopier copier = new ArrayCopier();

        //Both arrays are of the same size.
        int[] copied1 = copier.copy(source, arr8);
        printArray(arr = copied1, label = "Copied, same size: ");

        // The source array is longer.
        int[] copied1 = copier.copy(source, arr5);
        printArray(arr = copied1, label = "Copied, source longer: ");

        //The source array is shorter.
        int[] copied1 = copier.copy(source, arr12);
        printArray(arr = copied1, label = "Copied, source shorter: ");


    }

    private void printArray(int[] arr, String label){
        for(int value : arr){
            System.out.print(label + value + ", ");
        }
    }
}