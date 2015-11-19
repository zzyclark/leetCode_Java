package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class LongestPalindromicSubstringTest {
    private String s;

    @Before
    public void initialize() {
        s = "yuyihhiyabbasdaf";
    }

    @Test
    public void longestPalindrome() {
        String actualResult = LongestPalindromicSubstring.longestPalindrome(s);
        String expectResult = "yihhiy";

        assertEquals(expectResult, actualResult);
    }
}
