public class Fibonacci{

    private int[] memoisation;

    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();
        int fibNum = 12;
        if(args.length > 0)
            fibNum = fb.getFibNum(args[0]);
        
        fb.runFibonacciTests(fibNum);        
    }

    private void runFibonacciTests(int fibNum){
        System.out.println(String.format("Fibonacci element number %d:", fibNum));    
        runWithoutMemoisation(fibNum); 
        System.out.println("--");    
        runWithMemoisation(fibNum);               
    }

    private void runWithoutMemoisation(int fibNum){
        long start = System.nanoTime();
        System.out.println("No memoisation result: "+fib(fibNum));
        long end = System.nanoTime();
        System.out.println(getTimeDifferenceInMs(start, end));
    }

    private void runWithMemoisation(int fibNum){
        long start = System.nanoTime();
        System.out.println("Memoisation result: "+fibMemo(fibNum));
        long end = System.nanoTime();
        System.out.println(getTimeDifferenceInMs(start, end));
    }

    private int getFibNum(String arg){
        int fibNum = 12;
        try{
            fibNum = Integer.parseInt(arg);
        }
        catch(Exception e){
            fibNum = 12;
        }
        return fibNum;
    }

    private String getTimeDifferenceInMs(long start, long end){
        return String.format("%.5g ms",(end - start)*1E-6);
    }

    public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } 
        return fib(n-1) + fib(n-2);
    }

    public int fibMemo(int n){
        if(this.memoisation == null)
            this.memoisation = initMemoisationArray(n);

        if(this.memoisation[n-1] == -1)
            this.memoisation[n-1] = fibMemo(n-1) + fibMemo(n-2);

        return this.memoisation[n-1];
    }

    private static int[] initMemoisationArray(int size){
        int[] memoisation = new int[size];

        memoisation[0] = memoisation[1] = 1;   

        for(int i = 2; i < size; i++){
            memoisation[i] = -1;
        }
        return memoisation;
    }
}