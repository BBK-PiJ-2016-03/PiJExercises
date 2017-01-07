import java.util.List;
import java.util.function.Function;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class Task7Utils {
    public static List<String> transformedList(List<String> list, Function<String, String> func){
        list.replaceAll(func::apply);
        return list;
    }
}
