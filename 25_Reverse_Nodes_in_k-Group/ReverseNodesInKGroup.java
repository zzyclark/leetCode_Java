public class ReverseNodesInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2)
            return head;

        ListNode p = head;

        //check whether list have enough node
        for (int i = 0; i < k ; i++) {
            if (p == null)
                return head;
            p = p.next;
        }

        ListNode result = new ListNode(0);
        result.next = head;
        for (int i = 0; i < k - 1; i++) {
            ListNode move = head.next;
            head.next = move.next;
            move.next = result.next;
            result.next = move;
        }

        head.next = reverseKGroup(p, k);

        return result.next;
    }
}
