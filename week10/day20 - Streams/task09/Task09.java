import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 10/12/2016.
 */
public class Task09 {

    public static void main(String[] args) {
        System.out.println(randomNumberList(5));
        System.out.println(randomNumberList(5));
        System.out.println(randomNumberList(5));
    }

//    (a) Write a static method that produces a List of a specified length of random numbers.
//    E.g.: List<Double> nums = randomNumberList(someSize);
//    // Result is something like [0.7096867136897776, 0.09894202723079482, ...]
    public static List<Double> randomNumberList(long size){
        return new Random().doubles(size)
                .boxed()
                .collect(Collectors.toList());
    }

//    (b) Write a static method that produces a list of numbers that go in order by a step size.
//    E.g.: List<Integer> nums = orderedNumberList(50, 5, someSize);
//    // Result is [50, 55, 60, ...]
    public static List<Integer> orderedNumberList(int start, int step, int size){
        return null;
    }

}
