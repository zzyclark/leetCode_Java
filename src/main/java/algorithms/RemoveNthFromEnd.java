package algorithms;

import model.ListNode;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0)
            return head;

        ListNode target = null;
        ListNode tracker = head;

        while (tracker != null) {

            target = target == null ? null : target.next;

            if (n == 0)
                target = head;

            n--;
            tracker = tracker.next;
        }

        if (target != null)
            target.next = target.next.next;
        else if (n == 0)    //if n = 0 and target is still null, which means there is only 1 node or no node.
            head = head.next;
        return head;
    }
}
