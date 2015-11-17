import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Merge_K_Sorted_ListsTest {
    private ListNode[] lists;
    private MergeKSortedLists merger;
    private ListNode expectResult;

    @Before
    public void initialize() {
        lists = new ListNode[3];
        lists[0] = ListNodeConstructor.contruct(new int[] {2, 3, 4, 9});
        lists[1] = ListNodeConstructor.contruct(new int[] {1, 5, 6, 8});
        lists[2] = ListNodeConstructor.contruct(new int[] {3, 7, 7, 10});

        expectResult = ListNodeConstructor.
                contruct(new int[] {1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10});

        merger = new MergeKSortedLists();
    }

    @Test
    public void mergeKLists() {
        ListNode actualResult = merger.mergeKLists(lists);

        while (actualResult != null && expectResult != null) {
            Assert.assertEquals(actualResult.val, expectResult.val);

            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }

        Assert.assertTrue(true);
    }

    @Test
    public void mergeKListsUsePriorityQueue() {
        ListNode actualResult = merger.mergeKListsUsePriorityQueue(lists);

        while (actualResult != null && expectResult != null) {
            Assert.assertEquals(actualResult.val, expectResult.val);

            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }
    }
}
