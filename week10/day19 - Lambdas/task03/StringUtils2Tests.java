import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class StringUtils2Tests {

    @Test
    public void testBetterStringSuccessExample1(){
        String string1 = "Better";
        String string2 = "Worse";
        Boolean response = StringUtils2.betterString(string1, string2, (String s1, String s2) -> s1.length() > s2.length());
        Boolean expected = true;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterStringFailureExample1(){
        String string1 = "Better";
        String string2 = "Worse";
        Boolean response = StringUtils2.betterString(string1, string2, (String s1, String s2) -> s1.length() < s2.length());
        Boolean expected = false;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterStringSuccessExample2(){
        String string1 = "Better";
        String string2 = "Worse";
        Boolean response = StringUtils2.betterString(string1, string2, (s1, s2) -> true);
        Boolean expected = true;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterStringFailureExample2(){
        String string1 = "Better";
        String string2 = "Worse";
        Boolean response = StringUtils2.betterString(string1, string2, (s1, s2) -> true);
        Boolean expected = true;
        assertEquals(expected, response);
    }



}
