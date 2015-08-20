import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalResult = new ArrayList<List<Integer>>();

        //sort input array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums.length < 3)
                return finalResult;
            for (int j = i + 1; j < nums.length -2; j++) {
                int first = nums[i];
                int second = nums[j];

                int head = j + 1, tail = nums.length - 1;

                while (head < tail) {
                    if (first + second + nums[head] + nums[tail] == target) {
                        if (!(finalResult.size() != 0 &&
                        finalResult.get(finalResult.size() - 1).get(0) == nums[i] &&
                        finalResult.get(finalResult.size() - 1).get(1) == nums[j] &&
                        finalResult.get(finalResult.size() - 1).get(2) == nums[head])) {
                            List<Integer> item = new ArrayList<Integer>();
                            item.add(nums[i]);
                            item.add(nums[j]);
                            item.add(nums[head]);
                            item.add(nums[tail]);
                            finalResult.add(item);
                        }
                        head++;
                        tail--;
                    } else if (first + second + nums[head] + nums[tail] > target) {
                        tail--;
                    } else {
                        head++;
                    }
                }

                while (nums[j] == nums[j + 1] && j < nums.length - 2)
                    j++;
            }
            while (nums[i] == nums[i+1] && i < nums.length - 3)
                i++;
        }
        return finalResult;
    }
}
