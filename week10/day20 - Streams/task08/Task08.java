import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class Task08 {
    private static final List<String> words = Arrays.asList("hiq", "hel", "hoe", "har", "he", "hub");

    public static void main(String[] args) {
        Task08 task = new Task08();
        task.run();
    }

    private void run(){

    }

    private void a(){
//        (a) Produce a single String that is the result of concatenating the uppercase versions of all
//        of the Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation,
//        without using map.

    }

    private void b(){
//        (b) Produce the same String as above, but this time via a map operation that turns the
//        words into upper case, followed by a reduce operation that concatenates them.

    }

    private void c(){
//        (c) (*) Produce a String that is all the words concatenated together, but with commas in
//        between. E.g., the result should be "hi,hello,...". Note that there is no comma at
//        the beginning, before “hi”, and also no comma at the end, after the last word.
    }
}
