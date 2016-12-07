import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class GenericUtilsTests {

    @Test
    public void testBetterStringSuccess(){
        String string1 = "Better";
        String string2 = "Worse";
        Boolean response = GenericUtils.betterEntry(string1, string2, (String s1, String s2) -> s1.length() > s2.length());
        Boolean expected = true;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterIntSuccess(){
        int int1 = 9;
        int int2 = 8;
        Boolean response = GenericUtils.betterEntry(int1, int2, (a, b) -> a > b);
        Boolean expected = true;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterBooleanSuccess(){
        Boolean b1 = true;
        Boolean b2 = true;
        Boolean response = GenericUtils.betterEntry(b1, b2, (a, b) -> a);
        Boolean expected = true;
        assertEquals(expected, response);
    }

    @Test
    public void testBetterBooleanFail(){
        Boolean b1 = false;
        Boolean b2 = true;
        Boolean response = GenericUtils.betterEntry(b1, b2, (a, b) -> a);
        Boolean expected = false;
        assertEquals(expected, response);
    }



}
