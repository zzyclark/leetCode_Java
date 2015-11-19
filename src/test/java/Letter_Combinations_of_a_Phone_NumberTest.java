import algorithms.LetterCombinationsOfAPhoneNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Letter_Combinations_of_a_Phone_NumberTest {
    private String digits;

    @Before
    public void initialize() {
        digits = "23";
    }

    @Test
    public void letterCombinations() {
        List<String> actualResult = LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        String[] expectResult = new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};

        Assert.assertEquals(expectResult.length, actualResult.size());

        for (int i = 0; i < expectResult.length; ++i) {
            Assert.assertTrue(actualResult.contains(expectResult[i]));
        }
    }
}
