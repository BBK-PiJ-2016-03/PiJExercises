package Task08_Instance_counter;

/**
 * Created by Alexander Worton on 07/01/2017.
 */
public class App {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            Spy spy = new Spy(i);
            if(i%3 == 0)
                spy.die();
        }
    }
}
