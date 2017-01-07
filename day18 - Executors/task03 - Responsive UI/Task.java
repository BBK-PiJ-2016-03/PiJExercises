public class Task implements Runnable{

    private int durationInMillis;
    private int taskNumber; 
    private Ui origin;

    public Task(int durationInMillis, int taskNumber, Ui origin) {
        this.durationInMillis = durationInMillis;
        this.taskNumber = taskNumber;
        this.origin = origin;
    }

    public int getTaskNumber(){
        return taskNumber;
    }

    @Override
    public synchronized void run(){        
        trySleep();
    }

    private void trySleep(){
        try{
            Thread.sleep(this.durationInMillis);                        
                      
        }        
        catch(InterruptedException e){
            System.out.println("InterruptedException caught!");
        }
        finally{
            synchronized(origin){
                this.origin.reportTaskFinished(this);
            }
        }
    }

}