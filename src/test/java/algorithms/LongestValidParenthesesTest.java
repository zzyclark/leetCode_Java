package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class LongestValidParenthesesTest {
    @Test
    public void longestValidParentheses() {
        Integer actualResult = LongestValidParentheses.longestValidParentheses("()");
        Integer expectResult = 2;

        assertEquals(expectResult, actualResult);

        actualResult = LongestValidParentheses.longestValidParentheses(")()())");
        expectResult = 4;

        assertEquals(expectResult,actualResult);

        actualResult = LongestValidParentheses.longestValidParentheses(")()())(())()((");
        expectResult = 6;

        assertEquals(expectResult,actualResult);
    }
}
