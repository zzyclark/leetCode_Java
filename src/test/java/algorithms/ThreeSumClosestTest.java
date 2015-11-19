package algorithms;

import algorithms.ThreeSumClosest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class ThreeSumClosestTest {
    private int[] nums;
    private int target;

    @Before
    public void initialize() {
        nums = new int[] {-1, 2, 1, -4};
        target = 1;
    }

    @Test
    public void threeSumClosest() {
        Integer actualResult = ThreeSumClosest.threeSumClosest(nums, target);
        Integer expectResult = 2;

        Assert.assertEquals(expectResult, actualResult);
    }
}
