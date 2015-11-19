package algorithms;

import model.ListNode;
import org.junit.Before;
import org.junit.Test;
import testUtil.ListNodeConstructor;

import static org.junit.Assert.*;

/**
 * @Author clark
 * @Date 19-Nov-2015
 */
public class AddTwoNumbersTest {
    private ListNode l1, l2;

    @Before
    public void initialize() {
        l1 = ListNodeConstructor.contruct(new int[] {2, 4, 3});
        l2 = ListNodeConstructor.contruct(new int[] {5, 6, 4});
    }

    @Test
    public void addTwoNumbers() {
        ListNode actualResult = AddTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expectResult = ListNodeConstructor.contruct(new int[] {7, 0, 8});

        while (actualResult != null && expectResult != null) {
            assertEquals(expectResult.val, actualResult.val);

            actualResult = actualResult.next;
            expectResult = expectResult.next;
        }
    }
}
