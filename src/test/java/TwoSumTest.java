import algorithms.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class TwoSumTest {
    private int[] sums;
    private Integer target;

    @Before
    public void initialize() {
        sums = new int[] {2, 7, 11, 15};
        target = 9;
    }

    @Test
    public void twoSum() {
        int[] actualResult = TwoSum.twoSum(sums, target);
        int[] expectResult = new int[] {1, 2};

        Assert.assertArrayEquals(expectResult, actualResult);
    }
}
