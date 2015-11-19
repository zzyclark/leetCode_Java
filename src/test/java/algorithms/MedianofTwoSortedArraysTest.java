package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class MedianofTwoSortedArraysTest {
    public int[] nums1, nums2;

    @Before
    public void initialize() {
        nums1 = new int[] {1, 3, 5, 7, 9};
        nums2 = new int[] {2, 4, 6, 8, 10};
    }

    @Test
    public void findMedianSortedArrays() {
        Double actualResult = FindMedianSortArrays.findMedianSortArrays(nums1, nums2);
        Double expectResult = 5.5;

        assertEquals(expectResult,actualResult);
    }

    @Test
    public void alternateSolution() {
        Double actualResult = FindMedianSortArrays.alternateFunction(nums1, nums2);
        Double expectResult = 5.5;

        assertEquals(expectResult,actualResult);
    }

}
