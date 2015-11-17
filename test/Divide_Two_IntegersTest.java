import org.junit.Assert;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Divide_Two_IntegersTest {
    @Test
    public void divide () {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        Integer dividend = 55;
        Integer divisor = 10;

        Integer actualResult = divider.divide(dividend, divisor);
        Assert.assertEquals((long)5, (long)actualResult);
    }
}
