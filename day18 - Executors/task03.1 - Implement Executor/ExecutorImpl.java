import java.util.concurrent.Executor;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;;
public class ExecutorImpl implements Executor{

    int concurrentTasksLimit = Runtime.getRuntime().availableProcessors();
    private Queue<Runnable> pendingTasks = new ConcurrentLinkedQueue<>();

    public ExecutorImpl(){
        spawnThreads();
    }

    public ExecutorImpl(int concurrentTasksLimit){
        this.concurrentTasksLimit = concurrentTasksLimit;
        spawnThreads();
    }

    @Override
    public void execute(Runnable command) throws NullPointerException{
        if(command == null)
            throw new NullPointerException("Runnable command supplied to executor is null"); 

        pendingTasks.add(command);  
        sendNotify();      
    }

    private synchronized void sendNotify(){
        notifyAll();
    }

    private void spawnThreads(){
        for(int i = 1; i <= concurrentTasksLimit; i++){
            Thread t = new Thread(new TaskRunner(this));
            t.setName("Executor Thread "+i);
            t.start();
        }
    }

    public synchronized Runnable getNextRunnable(){
        if(!pendingTasks.isEmpty())
            return pendingTasks.poll();

        tryWait();
        return pendingTasks.poll();        
    }

    private void tryWait(){
        try{
            wait();
        }
        catch(InterruptedException e){
            //wait less
        }
    }
}