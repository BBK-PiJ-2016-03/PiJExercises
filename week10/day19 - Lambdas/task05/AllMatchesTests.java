import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Alexander Worton on 07/12/2016.
 */
public class AllMatchesTests {

    private List<String> shortWordsCompare = Arrays.asList("one", "two");
    private List<String> wordsWithBCompare = Arrays.asList("balls");
    private List<String> evenLengthWordsCompare = Arrays.asList("four", "five");

    @Test
    public void testShortWords(){
        List<String> words = getList();
        List<String> shortWords = Task5Utils.allMatches(words, s -> s.length() < 4);
        //assertEquals(shortWords.toString(), this.shortWordsCompare.toString());
    }

    private List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("balls");
        return list;
    }

    @Test
    public void testWordsWithB(){
        List<String> words = getList();
        List<String> wordsWithB = Task5Utils.allMatches(words, s -> s.contains("b"));
        assertEquals(wordsWithB.toString(), this.wordsWithBCompare.toString());
    }

    @Test
    public void testEvenLengthWords(){
        List<String> words = getList();
        List<String> evenLengthWords = Task5Utils.allMatches(words, s -> (s.length() % 2) == 0);
        assertEquals(evenLengthWords.toString(), this.evenLengthWordsCompare.toString());
    }
}
