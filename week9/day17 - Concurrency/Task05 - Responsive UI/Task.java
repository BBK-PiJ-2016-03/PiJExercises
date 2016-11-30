import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Task implements Runnable{

    private int durationInMillis;
    private int taskNumber;
    private List<Integer> completedTasks = new ArrayList<>();
    private boolean complete = false;
    private Task origin;
    private int completedTaskCount = 0;
    

    public Task(){

    }

    public Task(int durationInMillis, int taskNumber, Task origin) {
        this.durationInMillis = durationInMillis;
        this.taskNumber = taskNumber;
        this.origin = origin;
    }

    public static void main(String[] args) {
        Task task = new Task();
        for(int i = 1; i <= 10; i++){
            task.startNextTask(i);
        }
        task.waitForAllThreadsToFinish();
    }

    public synchronized void reportTaskFinished(int id){
        completedTasks.add(id);
        completedTaskCount++;
    }

    private void startNextTask(int taskNumber){
        int duration = getDurationFromUser(taskNumber);
        Thread thread = new Thread(new Task(duration, taskNumber, this));
        thread.start();
        checkCompletedTasks();
    }

    private synchronized void waitForAllThreadsToFinish(){
        while(completedTaskCount < 10){
            try{
                System.out.println("completedTaskCount: " + completedTaskCount);                
                wait();
                checkCompletedTasks();
            }
            catch(InterruptedException e){
                //wait less
            }            
        }
        checkCompletedTasks();
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
        int size = this.completedTasks.size();
        System.out.print("Finished tasks: ");
        for(int i = 0; i < size; i++){
            String output = this.completedTasks.size() > 1 ? String.format("%d, ",this.completedTasks.remove(0)) : this.completedTasks.remove(0).toString();
            System.out.print(output);
        }
        System.out.println();
    }

    @Override
    public synchronized void run(){
        try{
            Thread.sleep(this.durationInMillis);
            this.origin.reportTaskFinished(this.taskNumber);
            
            notifyAll();            
        }
        catch(IllegalMonitorStateException e){
            System.out.println("Illegal Monitor State Exception Thrown");
        }
        catch(InterruptedException e){
            System.out.println("InterruptedException caught!");
        }
    }
}