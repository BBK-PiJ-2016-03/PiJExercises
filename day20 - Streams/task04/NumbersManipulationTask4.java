import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class NumbersManipulationTask4 {
    private static final List<Integer> source2 = Arrays.asList(1, 2, 3);
    private static final List<Integer> source3 = Arrays.asList(3, 4);

    public static void main(String[] args) {
        NumbersManipulationTask4 self = new NumbersManipulationTask4();
        self.run();
    }

    private void run() {
        System.out.println("Pairs....");
        System.out.println("Source: "+source2+" "+source3);
        System.out.println("Result: "+pairs(source2, source3));
    }

    private List<String> pairs(List<Integer> source1, List<Integer> source2){
        return source1.stream()
                .flatMap(e1 -> source2.stream().map(e2 -> new int[]{e1, e2}))
                .filter(arr -> (arr[0] + arr[1]) % 3 == 0)
                .map(arr -> "(" + arr[0] + "," + arr[1] + ")")
                .collect(Collectors.toList());
    }
}
