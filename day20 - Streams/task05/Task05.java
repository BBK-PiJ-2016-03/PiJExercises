import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class Task05 {
    private static final List<String> words = Arrays.asList("hi", "hello", "how", "har", "hoo");

    public static void main(String[] args) {
//        Loop through the words and print each on a separate line, with two spaces in front of each word.
        words.stream()
                .forEach(s -> System.out.println("  "+s));

//        Repeat the previous problem, but without the two spaces in front. This is trivial if you
//        use the same approach as in (5a), so the point here is to use a method reference.
        words.stream()
                .forEach(System.out::println);
    }
}
