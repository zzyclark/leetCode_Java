import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Remove_ElementTest {
    int[] nums;
    Integer val;

    @Before
    public void initialize() {
        nums = new int[] {2, 3, 4, 1, 4, 2, 5, 1};
        val = 2;
    }

    @Test
    public void removeElement() {
        RemoveElement remover = new RemoveElement();

        Integer actualResult = remover.removeElement(nums, val);
        Assert.assertEquals((long) 6, (long) actualResult);
    }
}
