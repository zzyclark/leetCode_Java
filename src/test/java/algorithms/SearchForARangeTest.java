package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 20-Nov-2015
 */
public class SearchForARangeTest {
    @Test
    public void searchRangeSuccess() {
        int[] actualResult = SearchForARange.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
        int[] expectResult = new int[] {3, 4};

        assertArrayEquals(expectResult, actualResult);

        actualResult = SearchForARange.searchRange(new int[] {5, 5, 7}, 5);
        expectResult = new int[] {0, 1};

        assertArrayEquals(expectResult, actualResult);

        actualResult = SearchForARange.searchRange(new int[] {5, 5, 7, 8, 8, 10, 10}, 10);
        expectResult = new int[] {5, 6};

        assertArrayEquals(expectResult, actualResult);

        actualResult = SearchForARange.searchRange(new int[] {5}, 5);
        expectResult = new int[] {0, 0};

        assertArrayEquals(expectResult, actualResult);
    }

    @Test
    public void seachRangeFail() {
        int[] expectResult = new int[] {-1, -1};

        int[] actualResult = SearchForARange.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 9);
        assertArrayEquals(expectResult, actualResult);

        actualResult = SearchForARange.searchRange(new int[] {}, 9);
        assertArrayEquals(expectResult, actualResult);
    }
}
