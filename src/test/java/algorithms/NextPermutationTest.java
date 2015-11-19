package algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class NextPermutationTest {
    @Test
    public void nextPermutation() {
        int[] nums1 = new int[] {1, 2, 3};
        int[] nums2 = new int[] {3, 2, 1};
        int[] nums3 = new int[] {1, 3, 2};
        int[] nums4 = new int[] {2, 3, 1};

        NextPermutation.nextPermutation(nums1);
        NextPermutation.nextPermutation(nums2);
        NextPermutation.nextPermutation(nums3);
        NextPermutation.nextPermutation(nums4);

        int[] expectResult1 = new int[] {1, 3, 2};
        int[] expectResult2 = new int[] {1, 2, 3};
        int[] expectResult3 = new int[] {2, 1, 3};
        int[] expectResult4 = new int[] {3, 1, 2};

        assertArrayEquals(expectResult1, nums1);
        assertArrayEquals(expectResult2, nums2);
        assertArrayEquals(expectResult3, nums3);
        assertArrayEquals(expectResult4, nums4);
    }
}
