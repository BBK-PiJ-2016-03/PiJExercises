public class RunnableExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("I've run!");
            }
        });

        Thread t2 = new Thread("A new Thread!"){
            public void run() {
                System.out.println("I've also run!");
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
    }
}