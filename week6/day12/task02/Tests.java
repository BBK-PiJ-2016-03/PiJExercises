import org.junit.*;
import static org.junit.Assert.*;

public class Tests{
    
    @Test
    public void testShortHash(){        
        for(int i = 0; i < 5000; i++){      
            int hash = HashUtilities.shortHash(i);
            assertTrue(String.format("%d returns a hash: %d that is out of range", i, hash), 0 <= hash && hash <= 1000);
        }
    }
}

