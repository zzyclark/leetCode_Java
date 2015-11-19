import algorithms.IntegerToRoman;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Intefer_To_RomanTest {
    private Integer num;

    @Before
    public void initialize() {
        num = 3654;
    }

    @Test
    public void intToRomain() {
        String actualResult = IntegerToRoman.intToRoman(num);
        String expectResult = "MMMDCLIV";

        Assert.assertEquals(expectResult, actualResult);
    }
}
