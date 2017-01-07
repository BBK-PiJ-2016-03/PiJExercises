import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary{
    Library lib;

    @Test
    public void testGetNameSingleWord(){
        nameMatch("Name");        
    }

    private void nameMatch(String name){
        this.lib = new LibraryImpl(name);
        assertEquals(name, this.lib.getName());
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
        Library lib = setMaxBooks(-5);
        assertEquals(1, lib.getMaxBooksPerUser());
    }

    private Library setMaxBooks(int max){
        this.lib = new LibraryImpl("name");
        this.lib.setMaxBooksPerUser(max);
        return this.lib;
    }

    @Test
    public void getMaxBooksPerUserZero(){
        Library lib = setMaxBooks(0);
        assertEquals(1, lib.getMaxBooksPerUser());
    }

    @Test
    public void getMaxBooksPerUserOne(){
        Library lib = setMaxBooks(1);
        assertEquals(1, lib.getMaxBooksPerUser());
    }

    @Test
    public void getMaxBooksPerUserPositive(){
        Library lib = setMaxBooks(13);
        assertEquals(13, lib.getMaxBooksPerUser());
    }
}