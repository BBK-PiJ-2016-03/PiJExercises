import java.util.concurrent.Executor;

public class Spawner{
    public static void main(String[] args) {
        Executor exec = new ExecutorImpl();

        for(int i = 0; i < 100; i++){
            exec.execute(new Task());
        }
    }
}