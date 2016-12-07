import java.util.List;
import java.util.function.Function;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class Task8Utils {
    public static <T> List<T> transformedList(List<T> list, Function<T, T> func){
        list.replaceAll(func::apply);
        return list;
    }
}
