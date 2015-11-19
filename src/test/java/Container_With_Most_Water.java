import algorithms.ContainerWithMostWater;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Container_With_Most_Water {
    private int[] height;

    @Before
    public void initialize() {
        height = new int[] {0, 2, 4, 2, 5, 0, 9};
    }

    @Test
    public void maxArea() {
        Integer actualResult = ContainerWithMostWater.maxArea(height);
        Integer expectResult = 16;

        Assert.assertEquals(expectResult, actualResult);
    }
}
