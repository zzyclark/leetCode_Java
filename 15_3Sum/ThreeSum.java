import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 2)
            return result;
        //sort input array
        Arrays.sort(nums);

        //basic concept first list element must not be bigger than 0
        for (int i = 0; nums[i] <= 0 && i < nums.length - 2; ++i) {
            int front = i;

            int middle = i + 1;
            int tail = nums.length - 1;

            while (middle < tail) {
                if (nums[front] * -1 == nums[middle] + nums[tail]) {
                    if (!(result.size() != 0 &&
                            result.get(result.size() - 1).get(0) == nums[front] &&
                            result.get(result.size() - 1).get(1) == nums[middle])) {
                        List<Integer> item = new ArrayList<Integer>();
                        item.add(nums[front]);
                        item.add(nums[middle]);
                        item.add(nums[tail]);
                        result.add(item);

                    }
                    middle++;
                    tail--;
                }
                else if (nums[middle] + nums[tail] > nums[front] * -1) {
                    tail--;
                } else {
                    middle++;
                }
            }

            while (nums[i] == nums[i + 1] && i < nums.length - 2)
                i++;
        }
        return result;
    }
}
