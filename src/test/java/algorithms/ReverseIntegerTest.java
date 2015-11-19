package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class ReverseIntegerTest {
    private Integer x;

    @Before
    public void initialize() {
        x = 123;
    }

    @Test
    public void reverse() {
        Integer actualResult = ReverseInteger.reverse(x);
        Integer expectResult = 321;

        assertEquals(expectResult, actualResult);

        actualResult = ReverseInteger.reverse(-x);
        expectResult = - expectResult;

        assertEquals(expectResult, actualResult);
    }
}
