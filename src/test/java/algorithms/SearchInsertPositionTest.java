package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 18-Dec-2015
 */
public class SearchInsertPositionTest {
    private int[] nums;

    @Before
    public void initialize() {
        nums = new int[] {1,3,5,6};
    }

    @Test
    public void searchInsert() {
        assertEquals(2, SearchInsertPosition.searchInsert(nums, 5));
        assertEquals(1, SearchInsertPosition.searchInsert(nums, 2));
        assertEquals(4, SearchInsertPosition.searchInsert(nums, 7));
        assertEquals(0, SearchInsertPosition.searchInsert(nums, 0));
    }
}
