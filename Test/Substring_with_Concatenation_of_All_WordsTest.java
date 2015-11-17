import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.List;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Substring_with_Concatenation_of_All_WordsTest {
    @Test
    public void findSubString() {
        FindSubString findSubString = new FindSubString();
        String s = "aaaaaaaa";
        String[] words = new String[] {"aa", "aa", "aa"};

        List<Integer> result = findSubString.findSubstring(s, words);
        if (result.size() != 3) { //should be three integer
            assertTrue(false);
        } else {
            for (int i = 0; i < 3; ++i) {
                //result should be 0, 1, 2
                if (result.indexOf(i) < 0) {
                    assertTrue(false);
                }
            }
        }
        assertTrue(true);
    }
}
