package anagramtest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.model.Anagram;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    private final String entry1Guess = "castor";
    private final String entry2Guess = "castro";
    private final String entry1Mislead = "david";
    private final String entry2mislead = "daniel";
    private final boolean RESULT_ANAGRAM_GUESS = true;
    private final boolean RESULT_ANAGRAM_MISLED = false;

    @Test
    public void testAnagramGuess() {
        //ARRANGE
        Anagram anagram = new Anagram(entry1Guess, entry2Guess);
        //ACT
        Boolean result = anagram.isAnagram();
        //ASSERT
        assertEquals(RESULT_ANAGRAM_GUESS, result);
    }

    @Test
    public void testAnagramMislead() {
        //ARRANGE
        Anagram anagram = new Anagram(entry1Mislead, entry2mislead);
        //ACT
        Boolean result = anagram.isAnagram();
        //ASSERT
        assertEquals(RESULT_ANAGRAM_MISLED, result);
    }

}