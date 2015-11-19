import algorithms.DivideTwoIntegers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Divide_Two_IntegersTest {
    private Integer dividend, divisor;

    @Before
    public void initializer() {
        dividend = 55;
        divisor = 10;
    }

    @Test
    public void divide () {
        Integer actualResult = DivideTwoIntegers.divide(dividend, divisor);
        Assert.assertEquals((long)(dividend/divisor), (long)actualResult);
    }

    @Test
    public void divideAlternate () {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        Integer actualResult = divider.divideAlternative(dividend, divisor);
        Assert.assertEquals((long)(dividend/divisor), (long)actualResult);
    }
}
