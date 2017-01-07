/**
 * Created by Alexander Worton on 07/12/2016.
 */
@FunctionalInterface
public interface TwoStringPredicate {
    /***
     *
     * @param s1 The first string
     * @param s2 The second String
     * @return true if t1 is better than t2, false otherwise
     */
    boolean test(String s1, String s2);
}
