import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexander Worton on 10/12/2016.
 */
public class Task10 {

    private static final List<Integer> numbers = Arrays.asList(5, 20, 32, 43);
    private static final List<Double> doubles = Arrays.asList(5.0, 20.0, 32.0, 43.0);

    public static void main(String[] args) {
        System.out.println("Sum1: "+sum1(numbers));
        System.out.println("Sum2: "+sum2(numbers));
        System.out.println("Sum3: "+sum3(numbers));
        System.out.println("parallelSum: "+parallelSum(numbers));
        System.out.println("doublesProductSerial: "+doublesProductSerial(doubles));
        System.out.println("doublesProductParallel: "+doublesProductParallel(doubles));
    }

//    (a) (*) Provide three ways to use streams to compute the sum of a list of numbers
    public static int sum1(List<Integer> input){
        return input.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sum2(List<Integer> input){
        return input.stream()
                .reduce((num1, num2) -> num1+num2)
                .get();
    }

    public static int sum3(List<Integer> input){
        double average = input.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        long count = input.stream()
                .mapToInt(Integer::intValue)
                .count();

        return (int)(average * count);
    }

//    (b) (*) Rewrite one of the solutions for (10a) so that it can be executed in parallel; verify
//    that you get the same answer as for the sequential code.

    public static int parallelSum(List<Integer> input){
        return input.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
    }

//    (c) (**) Now, use streams to compute the product of some doubles. Show that serial and
//    parallel versions do not always give the same answer.
//            (Note: this is a bit tricky, because it seems at first that multiplication is associative, as
//    required by the parallel reduce. It will be impossible to illustrate the result if you have
//    a single-core computer.)
    public static int doublesProductSerial(List<Double> input){
        return 0;
    }

    public static int doublesProductParallel(List<Double> input){
        return 0;
    }
}
