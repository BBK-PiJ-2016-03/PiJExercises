public class PrintNumbers{
    public static void main(String[] args){
        PrintNumbers pn = new PrintNumbers();

        pn.printNumbers(6);

    }

    private void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }
}