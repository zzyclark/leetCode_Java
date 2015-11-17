import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Roman_To_IntegerTest {
    private String s;

    @Before
    public void initialize() {
        s = "MMMDCLIV";
    }

    @Test
    public void romanToInt() {
        Integer actualResult = RomanToInteger.romanToInt(s);
        Integer expectResult = 3654;

        Assert.assertEquals(expectResult, actualResult);
    }
}
