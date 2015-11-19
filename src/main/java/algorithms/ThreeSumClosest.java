package algorithms;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        int head = 1, tail = nums.length - 1, sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            head = i + 1;
            tail = nums.length - 1;
            while (head < tail) {
                sum = nums[i] + nums[head] + nums[tail];
                if (sum == target)
                    return target;
                result = Math.abs(result - target) > Math.abs(sum - target) ? sum : result;

                if (sum > target)
                    tail--;
                else if (sum < target)
                    head++;
            }
        }
        return result;
    }
}

