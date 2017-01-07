/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class GenericUtils {
    public static <T> boolean betterEntry(T e1, T e2, TwoElementPredicate<T> predicate){
        return predicate.test(e1, e2);
    }
}
