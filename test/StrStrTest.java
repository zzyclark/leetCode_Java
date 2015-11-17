import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class StrStrTest {
    private String needle, haystack;

    @Before
    public void initialize() {
        needle = "start";
        haystack = "itallstartonce";
    }

    @Test
    public void kmp() {
        Integer actualResult = StrStr.kmp(haystack, needle);
        Assert.assertEquals((long) 5, (long) actualResult);
    }

    @Test
    public void strStr() {
        Integer actualResult = StrStr.strStr(haystack, needle);
        Assert.assertEquals((long) 5, (long) actualResult);
    }
}
