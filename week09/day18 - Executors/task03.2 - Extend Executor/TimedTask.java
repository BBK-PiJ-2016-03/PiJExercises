public class TimedTask implements Runnable{
    private int sleepDuration = 1000;

    public TimedTask(int sleepDuration){
        this.sleepDuration = sleepDuration;
        validateSleepDuration();        
    }

    private void validateSleepDuration(){
        if(this.sleepDuration > 1000)
            this.sleepDuration = 1000;

        if(this.sleepDuration < 0)
            this.sleepDuration = 0;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(this.sleepDuration);
        }
        catch(InterruptedException e){
            System.out.println("Sleep for "+this.sleepDuration+" :: InterruptedException");
        }
    }
}