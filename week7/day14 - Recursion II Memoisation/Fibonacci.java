public class Fibonacci{

    private int[] memoisation;

    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();

        int fibNum = 5;

        long start, end;

        start = System.nanoTime();
        System.out.println(fb.fib(fibNum));
        end = System.nanoTime();
        System.out.println(fb.getMs(start, end));

        start = System.nanoTime();
        System.out.println(fb.fibMemo(fibNum));
        end = System.nanoTime();
        System.out.println(fb.getMs(start, end));
    }

    private String getMs(long start, long end){
        return String.format("%.5g%n",(end - start)*1E-6) + "ms";
    }

    public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } 

        return fib(n-1) + fib(n-2);
    }

    public int fibMemo(int n){

        if(this.memoisation == null || n >= this.memoisation.length){
            initMemoisationArray(n);
        }

        if(this.memoisation[n-1] == -1)
            this.memoisation[n-1] = fib(n-1) + fib(n-2);

        return this.memoisation[n-1];        
    }

    private void initMemoisationArray(int size){
        this.memoisation = new int[size];

        this.memoisation[0] = this.memoisation[1] = 1;   

        for(int i = 2; i < size; i++){
            this.memoisation[i] = -1;
        }

    }

}