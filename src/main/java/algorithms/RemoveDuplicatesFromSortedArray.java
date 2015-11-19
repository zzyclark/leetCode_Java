package algorithms;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int count = 1;
        int ptr = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == ptr)
                continue;
            else {
                nums[count] = nums[i];
                count++;
                ptr = nums[i];
            }
        }

        return count;
    }
}
