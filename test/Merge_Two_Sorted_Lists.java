import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Merge_Two_Sorted_Lists {
    private ListNode l1, l2;

    @Before
    public void initialize() {
        l1 = ListNodeConstructor.contruct(new int[] {1, 3, 5, 7, 9});
        l2 = ListNodeConstructor.contruct(new int[] {2, 4, 6, 8, 10});
    }

    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists merger = new MergeTwoSortedLists();

        ListNode actualResult = merger.mergeTwoLists(l1, l2);
        ListNode expectResult = ListNodeConstructor.
                contruct(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        while (actualResult != null && expectResult!= null) {
            Assert.assertEquals(actualResult.val, expectResult.val);

            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }
    }
}
