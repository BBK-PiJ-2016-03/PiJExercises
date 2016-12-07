public class TaskRunner implements Runnable{

    ExecutorImpl origin;
    public TaskRunner(ExecutorImpl origin){
        this.origin = origin;
    }

    public void run(){
        Runnable task;
        while((task = origin.getNextRunnable()) != null){
            task.run();
        }
    }
}