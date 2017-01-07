import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class Task06 {
    private static final List<String> words = Arrays.asList("hi", "hello", "how", "har", "hoo", "hub");

    public static void main(String[] args) {
        Task06 task = new Task06();
        task.run();
    }

    private void run(){
        printSource();
        runFunctionTests();
        runPredicateTests();
    }
    private void runFunctionTests() {
        runFunctionTest(s -> s + "!");
        runFunctionTest(s -> s.replace("i", "eye"));
        runFunctionTest(String::toUpperCase);
    }

    private void runFunctionTest(Function<String, String> func) {
        List<String> test = transformedList(words, func);
        print(test);
    }

    private void runPredicateTests() {
        runPredicateTest(s -> s.length() < 4);
        runPredicateTest(s -> s.contains("b"));
        runPredicateTest(s -> (s.length() % 2) == 0);
    }

    private void runPredicateTest(Predicate<String> predicate) {
        List<String> test = allMatches(words, predicate);
        print(test);
    }

    private <T> void print(List<T> list) {
        System.out.println(list);
    }

    private void printSource() {
        System.out.println();
        print(words);
        System.out.println();
    }

    private <T> List<T> transformedList(List<T> input, Function<T,T> func) {
        return input.stream()
                .map(e -> func.apply(e))
                .collect(Collectors.toList());
    }

    private <T> List<T> allMatches(List<T> input, Predicate<T> p){
        return input.stream()
                .filter(e -> p.test(e))
                .collect(Collectors.toList());
    }
}
