package algorithms;

import algorithms.ThreeSum;
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
public class ThreeSumTest {
    private int[] nums;

    @Before
    public void initialize() {
        nums = new int[] {-1, 0, 1, 2, -1, -4};
    }

    @Test
    public void threeSum() {
        List<List<Integer>> actualResult = ThreeSum.threeSum(nums);
        List<List<Integer>> expectResult = new ArrayList<List<Integer>>();

        expectResult.add(Arrays.asList(new Integer[] {-1, 0, 1}));
        expectResult.add(Arrays.asList(new Integer[] {-1, -1, 2}));

        Assert.assertEquals(expectResult.size(), actualResult.size());

        for (int i = 0; i < expectResult.size(); ++i) {
            Assert.assertTrue(actualResult.contains(expectResult.get(i)));
        }
    }
}
