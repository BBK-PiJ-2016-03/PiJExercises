import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class NumbersManipulation {

    private static final List<Integer> source1 = Arrays.asList(1, 2, 3, 4, 5);
    private static final List<Integer> source2 = Arrays.asList(1, 2, 3);
    private static final List<Integer> source3 = Arrays.asList(3, 4);

    public static void main(String[] args) {
        NumbersManipulation self = new NumbersManipulation();
        self.run();
    }

    private void run() {
        System.out.println("Squares....");
        System.out.println("Source: "+source1);
        System.out.println("Result: "+squares(source1));

        System.out.println();

        System.out.println("Pairs....");
        System.out.println("Source: "+source2+" "+source3);
        System.out.println("Result: "+pairs(source2, source3));
    }

    private List<Integer> squares(List<Integer> source) {
//        (a) Given a list of numbers, how would you return a list of the square of each number? For
//        example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
        return source.stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
    }

    private List<String> pairs(List<Integer> source1, List<Integer> source2){
//        (b) Given two lists of numbers, how would you return all pairs of numbers? For example,
//            given a list [1, 2, 3] and a list [3, 4] you should
//            return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
//        For simplicity, you can represent a pair as an array with two elements.
        return source1.stream()
                .flatMap(e1 -> source2.stream().map(e2 -> "("+e1+","+e2+")"))
                .collect(Collectors.toList());
    }

}
