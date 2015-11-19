package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class AtoiTest {
    private String str;

    @Before
    public void initialize() {
        str = "987654321";
    }

    @Test
    public void myAtoi() {
        Integer actualResult = Atoi.myAtoi(str);
        Integer expectResult = 987654321;

        assertEquals(expectResult, actualResult);
    }
}
