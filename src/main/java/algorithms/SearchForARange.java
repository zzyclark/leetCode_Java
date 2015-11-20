package algorithms;

/**
 * @Author clark
 * @Date 20-Nov-2015
 */
public class SearchForARange {
    public static int[] searchRange(int[] nums, int target) {
        int startPos = -1;
        int left = 0;
        int right = nums.length - 1;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                startPos = mid;
                break;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (-1 == startPos) {
            return new int[] {-1, -1};
        }

        left = startPos;
        right = startPos;

        while (left - 1 > -1 && nums[left - 1] == target) {
            left--;
        }

        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }

        return new int[] {left, right};
    }
}
