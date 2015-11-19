package algorithms;

import algorithms.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Longest_Common_PrefixTest {
    private String[] strs;

    @Before
    public void initialize() {
        strs = new String[] {"abc", "ab", "abde", "abce"};
    }

    @Test
    public void longestCommonPrefix() {
        String actualResult = LongestCommonPrefix.alternateSolution(strs);
        String expectResult = "ab";

        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void alternateSolution() {
        String actualResult = LongestCommonPrefix.alternateSolution(strs);
        String expectResult = "ab";

        Assert.assertEquals(expectResult, actualResult);
    }
}
