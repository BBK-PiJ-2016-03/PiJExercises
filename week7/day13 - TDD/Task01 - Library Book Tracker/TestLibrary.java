import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary{
    Library lib;

    private void nameMatch(String name){
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

    @Test
    public void getMaxBooksPerUserNegative(){
        this.lib = new LibraryImpl(name);
        lib.setMaxBooksPerUser(-5);
        assertEquals(0, this.lib.getMaxBooksPerUser());
    }

    @Test
    public void getMaxBooksPerUserZero(){
        this.lib = new LibraryImpl(name);
        lib.setMaxBooksPerUser(0);
        assertEquals(0, this.lib.getMaxBooksPerUser());
    }

    @Test
    public void getMaxBooksPerUserPositive(){
        this.lib = new LibraryImpl(name);
        lib.setMaxBooksPerUser(8);
        assertEquals(8, this.lib.getMaxBooksPerUser());
    }
}