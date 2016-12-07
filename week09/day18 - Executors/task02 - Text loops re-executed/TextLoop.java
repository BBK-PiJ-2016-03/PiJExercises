/* Output for no threaded mode will run each task consecutively.
* threaded mode will randomly jump and interupt threads, but each iteration on a single thread will continue in order, but interleaved
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TextLoop implements Runnable {
    public static final int COUNT = 10;
    private final String name;
    public TextLoop(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }
    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } 
        else if (args[0].equals("0")) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                r.run();
            }
        } 
        else {
            //Executor e = new ForkJoinPool();
            int numberOfProcessors = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);

            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);                
                executor.submit(r);
            }

            executor.shutdown();
            
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } 
            catch (InterruptedException e) {
                //wait less
            }
        }
    }
}
