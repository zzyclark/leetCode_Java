package algorithms;

import algorithms.ReverseNodesInKGroup;
import model.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import testUtil.ListNodeConstructor;

/**
 * @Author clark
 * @Date 17-Nov-2015
 */
public class Revese_Nodes_in_K_GroupTest {
    private ListNode head;
    private Integer k;

    @Before
    public void initialize() {
        int[] listNodeArray = new int[] {1, 2, 3, 4, 5};
        head = ListNodeConstructor.contruct(listNodeArray);
        k = 2;
    }

    @Test
    public void reverseKGroup() {
        ListNode actualResult = ReverseNodesInKGroup.reverseKGroup(head, k);
        int[] expectResultArray = new int[] {2, 1, 4, 3, 5};
        ListNode expectResult = ListNodeConstructor.contruct(expectResultArray);

        while (actualResult != null && expectResult != null) {
            if (actualResult.val != expectResult.val) {
                Assert.assertTrue(false);
            }
            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }

        Assert.assertTrue(true);
    }
}
