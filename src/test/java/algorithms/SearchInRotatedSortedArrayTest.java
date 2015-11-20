package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 20-Nov-2015
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void search() {
        Integer actualResult = SearchInRotatedSortedArray.search(new int[] {1, 3}, 2);
        Integer expectResult = -1;

        assertEquals(expectResult, actualResult);

        actualResult = SearchInRotatedSortedArray.search(new int[] {1}, 1);
        expectResult = 0;

        assertEquals(expectResult, actualResult);
    }
}
