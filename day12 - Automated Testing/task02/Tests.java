import org.junit.*;
import static org.junit.Assert.*;

public class Tests{
    
    @Test
    public void testShortHash(){        
        int hash;        
        for(int i = 0; i < 5000; i++){      
            int randomInput = getRand(Integer.MAX_VALUE);
            hash = HashUtilities.shortHash(randomInput);
            assertTrue(String.format("%d returns a hash: %d that is out of range", randomInput, hash), 0 <= hash && hash <= 1000);
        }

        int[] cornerCases = new int[]{0, -Integer.MAX_VALUE, Integer.MAX_VALUE};

        for(int input : cornerCases){
            hash = HashUtilities.shortHash(input);
            assertTrue(String.format("%d returns a hash: %d that is out of range", input, hash), 0 <= hash && hash <= 1000);
        } 

    }

    private int getRand(int max){
        return (int) Math.abs(Math.floor(Math.random() * (max+1)));
    }
}

