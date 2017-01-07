public class Example implements Runnable{

    public static void main(String[] args){

        Thread t1 = new Thread(new Example());
        Thread t2 = new Thread("T2"){
            public void run(){
                System.out.println("Thread: " + getName() + " running");
                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException e){
                    System.out.println("Sleep5k :: InterruptedException");
                }
                System.out.println("Thread: " + getName() + " complete");
            }
        };

        t1.start();
        t2.start();

        try{
        t1.join();
        t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Join :: InterruptedException");
        }
        System.out.println();
    }

    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getName() + " running");
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            System.out.println("Sleep4k :: InterruptedException");
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + " complete");
    }

}