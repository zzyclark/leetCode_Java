package algorithms;

/**
 * @Author clark
 * @Date 18-Dec-2015
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        Integer length = nums.length;

        //if target smaller than the first val in array
        if (0 == length || target < nums[0]) {
            return 0;
        } else if (target > nums[length - 1]) { // if target bigger than the last val in array
            return length;
        } else {
            return binarySearchPosition(nums, target, 0, length - 1);
        }
    }

    private static Integer binarySearchPosition(int[] nums, Integer target, Integer start, Integer end) {
        if (start > end) {  //if not find val in array
            return end + 1;
        } else {
            Integer mid = (start + end) / 2;
            if (nums[mid] > target) {
                return binarySearchPosition(nums, target, start, mid - 1);
            } else if (nums[mid] < target) {
                return binarySearchPosition(nums, target, mid + 1, end);
            } else {
                return mid;
            }
        }
    }
}
