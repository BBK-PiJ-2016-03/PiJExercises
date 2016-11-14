import org.junit.*;
import static org.junit.Assert.*;

public class TestBook{
    
   Book book;

    public static void main(String[] args) {
        
        TestBook test = new TestBook();
        test.testGetAuthor();
    
    }

    @Test
    public void testGetAuthor() {
        
        String expected = "Author";
        book = new BookImpl("Title", expected);
        assertEquals(book.getAuthor(), expected, "Expected author not returned");

        expected = "My Author";
        book = new BookImpl("Title", expected);
        assertEquals(book.getAuthor(), expected, "Expected author not returned");

        expected = "An Aut                               hor! .''. !£$%^&&((_(()+";
        book = new BookImpl("Title", expected);
        assertEquals(book.getAuthor(), expected, "Expected author not returned");

        expected = "";
        book = new BookImpl("Title", expected);
        assertEquals(book.getAuthor(), expected, "Expected author not returned");

        expected = null;
        book = new BookImpl("Title", expected);
        assertEquals(book.getAuthor(), expected, "Expected author not returned");
    }
}