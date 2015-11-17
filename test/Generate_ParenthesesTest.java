import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Generate_ParenthesesTest {
    private Integer n;
    private String[] expectResult;

    @Before
    public void initialize() {
        n = 3;
        expectResult = new String[] {"((()))", "(()())", "(())()", "()(())", "()()()"};
    }

    @Test
    public void generateParenthesis() {
        List<String> actualResult = GenerateParentheses.generateParenthesis(n);

        Assert.assertEquals(expectResult.length, actualResult.size());

        for (int i = 0; i < expectResult.length; ++i) {
            Assert.assertTrue(actualResult.indexOf(expectResult[i]) > -1);
        }
    }
}
