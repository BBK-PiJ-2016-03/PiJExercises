// value at end will be vary, as counter is not thread safe. May be any value up to 100,000
public class Increaser implements Runnable {
    private Counter c;
    public Increaser(Counter counter) {
        this.c = counter;
    }

    public static void main(String args[]) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
            t.start();
        }
    }   

    public void run() {
        System.out.println("Starting at " + c.getCount());
        for (int i = 0; i < 1000; i++) {
            c.increase();
        }
        System.out.println("Stopping at " + c.getCount());
    }
}
