public class Classics{
    public static void main(String[] args){
        Classics classics = new Classics();

        System.out.print(String.format("4! = %d :: \n", classics.factorialIterative(4)));

        System.out.print(String.format("4! = %d :: \n", classics.factorialRecursive(4)));

    }

    private int  factorialIterative(int n) {
        int total = 1;
        
        System.out.print("1 * ");
        for(int i = 2; i <= n; i++){
            total *= i;
            System.out.print(String.format(" * %d ", i));
        }
        return total;
    }

    private int factorialRecursive(int n) {
        if(n <= 0)
            return 1;

        System.out.print(String.format(" %d * ", n));
        return n * factorialRecursive(n-1);
    }
}