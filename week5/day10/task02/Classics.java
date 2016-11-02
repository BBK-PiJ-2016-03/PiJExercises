public class Classics{
    public static void main(String[] args){
        Classics classics = new Classics();

        /*
        System.out.print("4! : ");
        System.out.print(String.format(" = %d\n", classics.factorialIterative(4)));

        System.out.print("4! : ");
        System.out.print(String.format(" = %d\n", classics.factorialRecursive(4)));
        */

        for(int i = 1 ; i < 10; i++){
            System.out.println(String.format("%d: %d", i, classics.fibonacciRecursive(i)));
        }

    }

    private int  factorialIterative(int n) {
        int total = 1;
        for(int i = n; i >= 1; i--){
            total *= i;
            String output = i > 1 ? String.format("%d * ", i) : String.format("%d", i);
            System.out.print(output);
        }
        return total;
    }

    private int factorialRecursive(int n) {
        if(n <= 0){
            return 1;
        }

        String output = n > 1 ? String.format("%d * ", n) : String.format("%d", n);        
        System.out.print(output);

        return n * factorialRecursive(n-1);
    }

    private int fibonacciRecursive(int n){
        if(n <= 3)
            return 1;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}