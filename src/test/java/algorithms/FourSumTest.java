package algorithms;

import algorithms.FourSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class FourSumTest {
    private int[] nums;
    private int target;

    @Before
    public void initialize() {
        nums = new int[] {1, 0, -1, 0, -2, 2};
        target = 0;
    }

    @Test
    public void fourSum() {
        List<List<Integer>> actualResult = FourSum.fourSum(nums, target);
        List<List<Integer>> expectResult = new ArrayList<List<Integer>>();

        expectResult.add(Arrays.asList(new Integer[] {-1, 0, 0, 1}));
        expectResult.add(Arrays.asList(new Integer[] {-2, -1, 1, 2}));
        expectResult.add(Arrays.asList(new Integer[] {-2, 0, 0, 2}));

        Assert.assertEquals(expectResult.size(), actualResult.size());

        for (int i = 0; i < expectResult.size(); ++i) {
            Assert.assertTrue(actualResult.contains(expectResult.get(i)));
        }
    }
}
