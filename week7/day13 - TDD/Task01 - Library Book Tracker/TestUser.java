import org.junit.*;
import static org.junit.Assert.*;

public class TestUser{

    private LibraryUser user;

    @Test
    public void testgetNameSingleName(){
        String expected = "Name";
        this.user = new UserImpl(expected);
        assertEquals(expected, this.user.getName());
    }

    @Test
    public void testgetNameSpaceSeparatedName(){
        String expected = "My name";
        this.user = new UserImpl(expected);
        assertEquals(expected, this.user.getName());
    }

    @Test
    public void testgetNameSingleNameUsingSpecialChars(){
        String expected = "An Na                               me! .''. !£$%^&&((_(()+";
        this.user = new UserImpl(expected);
        assertEquals(expected, this.user.getName());
    }

    @Test
    public void testgetNameSingleNameUsingEmpty(){
        String expected = "";
        this.user = new UserImpl(expected);
        assertEquals(expected, this.user.getName());
    }

    @Test
    public void testgetNameSingleNameUsingNull(){
        String expected = null;
        this.user = new UserImpl(expected);
        assertEquals(expected, this.user.getName());
    }    

    @Test
    public void testGetLibraryIDRange(){
        this.user = getUserAssignedMockLibrary();
        assertTrue(user.getLibraryID() >= 0);
    }

    @Test
    public void testGetLibraryIDMatches(){
        this.user = getUserAssignedMockLibrary();
        assertEquals(13, user.getLibraryID());
    }

    private void getUserAssignedMockLibrary(){
        LibraryUser user = new UserImpl("New User");
        Library mock = new MockLibrary();
        user.register(mock);
    }
}