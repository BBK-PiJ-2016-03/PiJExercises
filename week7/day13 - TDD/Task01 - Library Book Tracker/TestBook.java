import org.junit.*;
import static org.junit.Assert.*;

public class TestBook{    
   Book book;

    @Test
    public void testGetAuthorSingleWord() {        
        String expected = "Author";
        this.book = new BookImpl("Title", expected);
        assertEquals(expected, book.getAuthor());        
    }

    @Test
    public void testGetAuthorUsingSpace() {
        String expected = "My Author";
        this.book = new BookImpl("Title", expected);
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testGetAuthorUsingSpecialChars() {
        String expected = "An Aut                               hor! .''. !£$%^&&((_(()+";
        this.book = new BookImpl("Title", expected);
        assertEquals(expected, book.getAuthor());        
    }

    @Test
    public void testGetAuthorUsingEmpty() {
        String expected = "";
        this.book = new BookImpl("Title", expected);
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testGetAuthorUsingNull() {     
        String expected = null;
        this.book = new BookImpl("Title", expected);
        assertEquals(expected, book.getAuthor());
    }    

    @Test
    public void testGetTitleSingleWord() {        
        String expected = "Title";
        this.book = new BookImpl(expected, "Author");
        assertEquals(expected, book.getTitle());
    }

    @Test
    public void testGetTitleUsingSpace() {
        String expected = "My Title";
        this.book = new BookImpl(expected, "Author");
        assertEquals(expected, book.getTitle());
    }

    @Test
    public void testGetTitleUsingSpecialChars() {
        String expected = "An Ti                                  tle! .''. !£$%^&&((_(()+";
        this.book = new BookImpl(expected, "Author");
        assertEquals(expected, book.getTitle());
    }

    @Test
    public void testGetTitleUsingEmpty() {
        String expected = "";
        this.book = new BookImpl(expected, "Author");
        assertEquals(expected, book.getTitle());
    }

    @Test
    public void testGetTitleUsingNull() {
        String expected = null;
        this.book = new BookImpl(expected, "Author");
        assertEquals(expected, book.getTitle());
    }
}