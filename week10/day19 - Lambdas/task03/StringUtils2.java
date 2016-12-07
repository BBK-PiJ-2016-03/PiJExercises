import java.util.function.BiPredicate;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class StringUtils2 {
    public static boolean betterString(String s1, String s2, BiPredicate<String,String> predicate){
        return predicate.test(s1, s2);
    }
}
