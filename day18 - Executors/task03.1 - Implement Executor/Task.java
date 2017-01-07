public class Task implements Runnable{
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread: " + threadName + " running");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Sleep1k :: InterruptedException");
        }
        System.out.println("Thread: " + threadName + " complete");
    }
}