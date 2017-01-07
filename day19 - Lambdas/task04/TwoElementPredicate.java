/**
 * Created by Alexander Worton on 07/12/2016.
 */
@FunctionalInterface
public interface TwoElementPredicate<T> {
    /***
     *
     * @param e1 The first Element
     * @param e2 The second Element
     * @return true if t1 is better than t2, false otherwise
     */
    boolean test(T e1, T e2);
}
