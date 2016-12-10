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
        runProcess();
        runProcessShowLazy();
    }

    private void runProcess() {
        runProcessEResult();
        runProcessQResult();
    }

    private void runProcessEResult() {
        System.out.println("--- Processing E Result ---");
        processEResult();
        System.out.println();
    }

    private void runProcessQResult() {
        System.out.println("--- Processing Q Result ---");
        processQResult();
        System.out.println();
    }

    private void processEResult() {
        String eResult = words.stream()
                .map(String::toUpperCase)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("E"))
                .limit(1)
                .collect(Collectors.joining());

        System.out.println("eResult: "+eResult);
    }

    private void processQResult() {
        String qResult = words.stream()
                .map(String::toUpperCase)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("Q"))
                .limit(1)
                .collect(Collectors.joining());

        System.out.println("qResult: "+qResult);
    }

    private void runProcessShowLazy() {
        runProcessLazyEResult();
        runProcessLazyQResult();
    }

    private void runProcessLazyEResult() {
        System.out.println("--- Processing Lazy E Result ---");
        processLazyEResult();
        System.out.println();
    }

    private void runProcessLazyQResult() {
        System.out.println("--- Processing Lazy Q Result ---");
        processLazyQResult();
        System.out.println();
    }

    private void processLazyEResult() {
        String eResult = words.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("E"))
                .limit(1)
                .peek(System.out::println)
                .collect(Collectors.joining());

        System.out.println("eResult: "+eResult);
    }

    private void processLazyQResult() {
        String qResult = words.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .filter(w -> w.length() < 4)
                .filter(w -> w.contains("Q"))
                .limit(1)
                .collect(Collectors.joining());

        System.out.println("qResult: "+qResult);
    }

}
