import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Task implements Runnable{

    private int durationInMillis;
    private int taskNumber;
    private List<Integer> completedTasks = new ArrayList<>();

    public Task(){

    }

    public Task(int durationInMillis, int taskNumber, List<Integer> completedTasks) {
        this.durationInMillis = durationInMillis;
        this.taskNumber = taskNumber;
        this.completedTasks = completedTasks;
    }

    public static void main(String[] args) {
        Task task = new Task();
        for(int i = 1; i <= 10; i++){
            task.startNextTask(i);
        }
    }

    private void startNextTask(int taskNumber){
        int duration = getDurationFromUser(taskNumber);
        Thread thread = new Thread(new Task(duration, taskNumber, this.completedTasks));
        thread.start();
        checkCompletedTasks();

        if(taskNumber == 10){
            synchronized(thread){
                try{
                    thread.wait();
                }
                catch(InterruptedException e){
                    //wait less
                }
                checkCompletedTasks();
            }       
        }
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

        synchronized(this.completedTasks){           
            printCompletedTasks();            
        }
    }

    private void printCompletedTasks(){
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
            synchronized(this.completedTasks){
                this.completedTasks.add(this.taskNumber);
            }
            
            notify();
            
        }
        catch(IllegalMonitorStateException e){
            System.out.println("Illegal Monitor State Exception Thrown");
        }
        catch(InterruptedException e){
            System.out.println("InterruptedException caught!");
        }
    }
}