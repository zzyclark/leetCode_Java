public class ListNodeConstructor {
    public static ListNode contruct(int[] input) {
        ListNode head = new ListNode(0);
        ListNode result = head;

        for (int i = 0; i < input.length; i++) {
            head.next = new ListNode(input[i]);
            head = head.next;
        }

        return result.next;
    }
}
