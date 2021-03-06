import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class Task6Utils {
    public static <T>  List<T> allMatches(List<T> list, Predicate<T> predicate){
        list.removeIf(e -> !predicate.test(e));
        return list;
    }
}
