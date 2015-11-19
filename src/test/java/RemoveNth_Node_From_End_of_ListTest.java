import algorithms.RemoveNthFromEnd;
import model.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import testUtil.ListNodeConstructor;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class RemoveNth_Node_From_End_of_ListTest {
    private ListNode head;
    private Integer n;

    @Before
    public void initialize() {
        head = ListNodeConstructor.contruct(new int[] {1, 2, 3, 4, 5});
        n = 2;
    }

    @Test
    public void removeNthFromEnd() {
        ListNode actualResult = RemoveNthFromEnd.removeNthFromEnd(head, n);
        ListNode expectResult = ListNodeConstructor.contruct(new int[] {1, 2, 3, 5});

        while (actualResult != null && expectResult!= null) {
            Assert.assertEquals(actualResult.val, expectResult.val);
            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }
    }
}
