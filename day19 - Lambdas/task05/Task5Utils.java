import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class Task5Utils {
    public static List<String> allMatches(List<String> list, Predicate<String> predicate){
        list.removeIf(e -> !predicate.test(e));
        return list;
    }
}
