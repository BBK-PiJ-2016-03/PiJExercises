import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class Task07 {
    private static final List<String> words = Arrays.asList("hiq", "hel", "hoe", "har", "he", "hub");

    public static void main(String[] args) {
        Task07 task = new Task07();
        task.run();
    }

    private void run(){
        process();
    }

    private void process() {
        String eresult = words.stream()
                .map(String::toUpperCase)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("E"))
                .limit(1)
                .collect(Collectors.joining());

        System.out.println("eresult: "+eresult);

        String qresult = words.stream()
                .map(String::toUpperCase)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("Q"))
                .limit(1)
                .collect(Collectors.joining());

        System.out.println("qresult: "+qresult);
    }

}
