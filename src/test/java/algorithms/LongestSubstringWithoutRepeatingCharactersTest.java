package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    public String s;

    @Before
    public void initialize() {
        s = "abcabcbb";
    }

    @Test
    public void lengthOfLongestSubstring() {
        Integer actualResult = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        Integer expectResult = 3;

        assertEquals(expectResult, actualResult);
    }

    @Test
    public void alternateSolution() {
        Integer actualResult = LengthOfLongestSubstring.alternateFunction(s);
        Integer expectResult = 3;

        assertEquals(expectResult, actualResult);
    }
}
