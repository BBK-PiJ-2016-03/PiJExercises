import java.util.Arrays;
import java.util.List;

/**
 * Created by Alexander Worton on 10/12/2016.
 */
public class Task10 {

    private List<Integer> numbers = Arrays.asList(5, 20, 32, 43);

    public static void main(String[] args) {
    }

//    (a) (*) Provide three ways to use streams to compute the sum of a list of numbers
    public int sum1(List<Integer> input){
        return 0;
    }

    public int sum2(List<Integer> input){
        return 0;
    }

    public int sum3(List<Integer> input){
        return 0;
    }

//    (b) (*) Rewrite one of the solutions for (10a) so that it can be executed in parallel; verify
//    that you get the same answer as for the sequential code.

    public int parallelSum(List<Integer> input){
        return 0;
    }

//    (c) (**) Now, use streams to compute the product of some doubles. Show that serial and
//    parallel versions do not always give the same answer.
//            (Note: this is a bit tricky, because it seems at first that multiplication is associative, as
//    required by the parallel reduce. It will be impossible to illustrate the result if you have
//    a single-core computer.)
    public int doublesProductSerial(List<Double> input){
        return 0;
    }

    public int doublesProductParallel(List<Double> input){
        return 0;
    }
}
