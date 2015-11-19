package algorithms;

import model.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode l3 = new ListNode(-1);
	ListNode returnNode = l3;

	int carry = 0;

	while(l1 != null || l2 != null || carry != 0) {
	    l3.next = new ListNode(-1);
	    l3 = l3.next;

	    int var1 = l1 == null ? 0 : l1.val;
	    int var2 = l2 == null ? 0 : l2.val;
	    int var3 = var1 + var2 + carry;

	    carry = 0;
	    
	    if (var3 > 9) {
		carry = var3 / 10;
		var3 = var3 % 10;
	    }

	    l3.val = var3;
	    l1 = l1 == null ? null : l1.next;
	    l2 = l2 == null ? null : l2.next;
	}
	return returnNode.next;
    }
}
