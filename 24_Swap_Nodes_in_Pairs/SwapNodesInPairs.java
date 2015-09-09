public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode result = new ListNode(0);
        ListNode p = result;

        //if listNode only have less than 2 elements, no need to do any change
        while(head != null && head.next != null) {
            //catch current second node
            ListNode temp = head.next;

            //change the first node next node to third node
            head.next = head.next.next;

            //change second node next node to first node
            temp.next = head;

            //add current list Node to result which the first two node has swapped
            p.next = temp;

            //skip the first two swapped node
            p = p.next.next;

            //now the first node is the second one, shift to the third one to do next swap phase
            head = head.next;
        }

        return result.next;
    }
}
