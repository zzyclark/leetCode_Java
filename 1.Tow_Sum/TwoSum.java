import java.util.HashMap;

public class TwoSum 
{
    public static int[] twoSum (int[] nums, int target) 
    {
	HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
	int len = nums.length;

	for (int i = 0; i < len; ++i)
	{
	    if (tracker.containsKey(nums[i]))
	    {
		return new int[] {tracker.get(nums[i])+1, i+1};
	    } else {
		tracker.put(target - nums[i], i);
	    }
	}
	return new int[2];
    }
}
