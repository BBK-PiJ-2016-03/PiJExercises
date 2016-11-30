import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ui{
 
    private List<Task> completedTasks = new ArrayList<>();
    private int completedTaskCount = 0;
    int numberOfProcessors = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(numberOfProcessors);

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
        // executor.shutdown();
            
        // try{
        //     executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        // } 
        // catch (InterruptedException e) {
        //     //wait less
        // }

        while(completedTaskCount < 10){
            tryWait();
            checkCompletedTasks();
        }
        
    }

    private synchronized void tryWait(){
        try{
            wait();    
        }        
        catch(InterruptedException e){
            //wait less
            //System.out.println("InterruptedException caught!");
        }
    }

    private void startNextTask(int taskNumber){
        int duration = getDurationFromUser(taskNumber);
        Task task = new Task(duration, taskNumber, this);
        executor.submit(task);
        checkCompletedTasks();
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