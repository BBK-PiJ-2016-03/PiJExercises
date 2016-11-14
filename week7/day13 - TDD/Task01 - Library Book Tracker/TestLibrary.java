import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary{
    Library lib;

    private nameMatch(String name){
        this.lib = new LibraryImpl(name);
        assertEquals(name, this.lib.getName());
    }

    @Test
    public void testGetNameSingleWord(){
        nameMatch("Name");        
    }

    @Test
    public void testGetNameSpacedWord(){
        nameMatch("Name Is"); 
    }

    @Test
    public void testGetNameSpecialChars(){
        nameMatch("%&*%£");
    }

    @Test
    public void testGetNameSpaces(){
        nameMatch("fh                                                   hd                          f");
    }

    @Test
    public void testGetNameEmpty(){
        nameMatch("");
    }

    @Test
    public void testGetNameNull(){
        nameMatch(null);
    }
}