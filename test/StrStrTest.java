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
        StrStr strStr = new StrStr();

        Integer actualResult = strStr.kmp(haystack, needle);
        Assert.assertEquals((long) 5, (long) actualResult);
    }

    @Test
    public void strStr() {
        StrStr strStr = new StrStr();

        Integer actualResult = strStr.strStr(haystack, needle);
        Assert.assertEquals((long) 5, (long) actualResult);
    }
}
