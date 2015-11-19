package algorithms;

import algorithms.ValidParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Valid_ParenthesesTest {
    private String s;

    @Before
    public void initialize() {
        s = "([{()}[]])";
    }

    @Test
    public void isValid() {
        Boolean actualResult = ValidParentheses.isValid(s);
        Assert.assertTrue(actualResult);
    }
}
