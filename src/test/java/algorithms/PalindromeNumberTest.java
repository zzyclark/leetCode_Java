package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class PalindromeNumberTest {
    private Integer i;

    @Before
    public void initialize() {
        i = 12321;
    }

    @Test
    public void isPalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(i));
    }
}
