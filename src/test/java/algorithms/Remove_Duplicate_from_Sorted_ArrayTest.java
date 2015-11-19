package algorithms;

import algorithms.RemoveDuplicatesFromSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Remove_Duplicate_from_Sorted_ArrayTest {
    private int[] nums;

    @Before
    public void initialize() {
        nums = new int[] {2, 2, 3, 4, 4, 4, 5, 6};
    }

    @Test
    public void removeDuplicates() {
        Integer actualResult = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        //expect result should start with 2, 3, 4, 5, 6
        for (int i = 0; i <= 4; ++i) {
            if (nums[i] != i + 2) {
                Assert.assertTrue(false);
            }
        }

        Assert.assertTrue(true);
    }
}
