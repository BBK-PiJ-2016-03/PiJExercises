import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class TransformedListTests {

    private List<String> addPlingCompare = Arrays.asList("one!", "two!", "five!");
    private List<String> IToEyeCompare = Arrays.asList("one", "two", "feyeve");
    private List<String> upperCompare = Arrays.asList("ONE", "TWO", "FIVE");

    @Test
    public void testAddPling(){
        List<String> words = getList();
        List<String> addPling = Task7Utils.transformedList(words,  s -> s + "!");
        assertEquals(addPling.toString(), this.addPlingCompare.toString());
    }

    private List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("five");
        return list;
    }

    @Test
    public void testIToEye(){
        List<String> words = getList();
        List<String> iToEyeCompare = Task7Utils.transformedList(words,  s -> s.replace("i", "eye"));
        assertEquals(iToEyeCompare.toString(), this.IToEyeCompare.toString());
    }

    @Test
    public void testUpper(){
        List<String> words = getList();
        List<String> upper = Task7Utils.transformedList(words,  String::toUpperCase);
        assertEquals(upper.toString(), this.upperCompare.toString());
    }
}
