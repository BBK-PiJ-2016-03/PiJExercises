import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest{

    @Test
    public void testGetInitials(){
        Person person = new Person();

        String[] inputs = new String[]{"Alexander Worton", "Alexander  Worton", "Alexander                          Worton","Barry", "", null};
        String[] expected = new String[]{"AW", "AW", "AW", "B", "", ""};
        String output;

        for(int i = 0; i < inputs.length; i++){
            output = person.getInitials(inputs[i]);
            assertEquals(expected[i], output);
        }
    }

}