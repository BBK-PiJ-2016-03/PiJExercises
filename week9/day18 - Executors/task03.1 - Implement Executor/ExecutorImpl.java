import java.util.concurrent.Executor;
public class ExecutorImpl implements Executor{

    @Override
    public void execute(Runnable command) throws NullPointerException{
        if(command == null)
            throw new NullPointerException("Runnable command supplied to executor is null"); 

        Thread t = new Thread(command);
        t.start();
    }
}