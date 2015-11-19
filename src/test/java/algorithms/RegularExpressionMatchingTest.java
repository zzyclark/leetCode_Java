package algorithms;

import algorithms.RegularExpressionMatching;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class RegularExpressionMatchingTest {
    @Test
    public void idMatch() {
        assertFalse(RegularExpressionMatching.isMatch("aa", "a"));
        assertTrue(RegularExpressionMatching.isMatch("aa", "aa"));
        assertFalse(RegularExpressionMatching.isMatch("aaa", "a"));
        assertTrue(RegularExpressionMatching.isMatch("aa", "a*"));
        assertTrue(RegularExpressionMatching.isMatch("aa", ".*"));
        assertTrue(RegularExpressionMatching.isMatch("ab", ".*"));
        assertTrue(RegularExpressionMatching.isMatch("aab", "c*a*b"));
    }

    @Test
    public void dpSolution2D() {
        assertFalse(RegularExpressionMatching.dpSolution2D("aa", "a"));
        assertTrue(RegularExpressionMatching.dpSolution2D("aa", "aa"));
        assertFalse(RegularExpressionMatching.dpSolution2D("aaa", "a"));
        assertTrue(RegularExpressionMatching.dpSolution2D("aa", "a*"));
        assertTrue(RegularExpressionMatching.dpSolution2D("aa", ".*"));
        assertTrue(RegularExpressionMatching.dpSolution2D("ab", ".*"));
        assertTrue(RegularExpressionMatching.dpSolution2D("aab", "c*a*b"));
    }
}
