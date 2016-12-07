import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ui{
 
    private List<Task> completedTasks = new ArrayList<>();
    private int completedTaskCount = 0;

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.start();        
    }

    private void start(){
        for(int i = 1; i <= 10; i++){
            startNextTask(i);
        }
        awaitTaskFinish();
    }

    private void awaitTaskFinish(){ 
        while(completedTaskCount < 10){
            tryWait();
            checkCompletedTasks();
        }      
    }

    private synchronized void tryWait(){
        if(completedTaskCount == 10)
            return;

        try{
            wait();    
        }        
        catch(InterruptedException e){
            //wait less
        }
    }

    private void startNextTask(int taskNumber){
        Thread t = getThreadForTask(taskNumber);
        t.start();
        checkCompletedTasks();
    }    

    private Thread getThreadForTask(int taskNumber){
        int duration = getDurationFromUser(taskNumber);
        Runnable task = new Task(duration, taskNumber, this);
        return new Thread(task);
    }
    
    public synchronized void reportTaskFinished(Task task){
        completedTasks.add(task);
        completedTaskCount++;
        notifyAll();
    }

    private int getDurationFromUser(int taskNumber){        
        String taskString = null;
        int response = 0;
        while(taskString == null){
            try{
                System.out.print(String.format("Enter the duration (in ms) of task %d: ", taskNumber));
                taskString = System.console().readLine();
                response = Integer.parseInt(taskString);
            }
            catch(NumberFormatException e){
                taskString = null;
            }
        }  
        return response;      
    }

    private void checkCompletedTasks(){
        if(this.completedTasks.size() < 1)
                return;
         
        printCompletedTasks();      
    }

    private synchronized void printCompletedTasks(){
        System.out.print("Finished tasks: ");
        for(int i = 0; i < this.completedTasks.size(); i++){
            System.out.print(getTaskOutput());
        }
        System.out.println();
    }

    private String getTaskOutput(){
        return this.completedTasks.size() > 1 ? String.format("%d ",this.completedTasks.remove(0).getTaskNumber()) : String.format("%d",this.completedTasks.remove(0).getTaskNumber());
    }
}