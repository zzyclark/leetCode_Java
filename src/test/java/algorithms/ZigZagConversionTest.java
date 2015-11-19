package algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class ZigZagConversionTest {
    private String s;
    private Integer numRows;

    @Before
    public void initialize() {
        s = "PAYPALISHIRING";
        numRows = 3;
    }

    @Test
    public void convert() {
        String actualResult = ZigzagConversion.convert(s, numRows);
        String expectResult = "PAHNAPLSIIGYIR";

        assertEquals(expectResult, actualResult);
    }
}
