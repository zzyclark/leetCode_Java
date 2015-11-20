package algorithms;

/**
 * @Author clark
 * @Date 20-Nov-2015
 */
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //smallest value of right part
        while (right > left) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivotPos = left;
        if (0 == pivotPos) {
            if (nums[0] > target) {
                return -1;
            } else {
                return binarySearchTarget(nums, 0, nums.length - 1, target);
            }
        } else {
            if (nums[pivotPos] > target) {
                return binarySearchTarget(nums, pivotPos, nums.length - 1, target);
            } else {
                return binarySearchTarget(nums, 0, pivotPos - 1, target);
            }
        }
    }

    private static int binarySearchTarget(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (nums[mid] > target) {
            return binarySearchTarget(nums, left, mid - 1, target);
        } else if (nums[mid] < target){
            return binarySearchTarget(nums, mid + 1, right, target);
        } else {
            return mid;
        }
    }
}
