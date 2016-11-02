public class Classics{
    public static void main(String[] args){
        Classics classics = new Classics();

        System.out.print("4! : ");
        System.out.print(String.format(" = %d\n", classics.factorialIterative(4)));

        System.out.print("4! : ");
        System.out.print(String.format(" = %d\n", classics.factorialRecursive(4)));

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
}