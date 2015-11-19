package algorithms;

import java.util.Arrays;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if (null == nums || 0 == nums.length || 1 == nums.length) {
            return;
        }
        CheckBackwards(nums, nums.length - 1);
    }

    private static void CheckBackwards(int[] nums, Integer startIndex) {
        if (startIndex == 0) {
            Arrays.sort(nums);
            return;
        }

        Integer previousPos = startIndex - 1;

        if (nums[startIndex] <= nums[previousPos]) {
            CheckBackwards(nums, previousPos);
        } else {
            Arrays.sort(nums, startIndex, nums.length);

            //find the smallest number after start index but still bigger than start index
            for (int i = startIndex; i < nums.length; ++i) {
                if (nums[i] > nums[previousPos]) {
                    startIndex = i;
                    break;
                }
            }

            Integer swapBuffer = nums[previousPos];
            nums[previousPos] = nums[startIndex];
            nums[startIndex] = swapBuffer;

            return;
        }
    }
}
