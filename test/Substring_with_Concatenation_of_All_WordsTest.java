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

        List<Integer> actualResult = findSubString.findSubstring(s, words);

        //Result should be [0, 1, 2], order may change.
        if (actualResult.size() != 3) {
            assertTrue(false);
        } else {
            for (int i = 0 ; i <= 2; ++i) {
                if (actualResult.indexOf(i) < 0) {
                    assertTrue(false);
                }
            }
        }

        assertTrue(true);
    }
}
