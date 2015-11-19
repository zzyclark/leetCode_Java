package algorithms;

import model.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    //use merge sort
    public static ListNode mergeKLists(ListNode[] lists) {
        if (0 == lists.length)
            return null;
        return merge(lists, 0, lists.length - 1);
    }

    private static ListNode merge(ListNode[] lists, int start, int end) {
        if (start == end)
            return lists[start];
        int mid = (start + end)/2;
        ListNode l1 = merge(lists, start, mid);
        ListNode l2 = merge(lists, mid+1, end);

        ListNode head = new ListNode(0);
        ListNode p = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            p = p.next;
        }

        if (l1 == null) {
            p.next = l2;
        }

        if (l2 == null) {
            p.next = l1;
        }
        return head.next;
    }

    public static ListNode mergeKListsUsePriorityQueue(ListNode[] lists) {
        if (lists.length == 0)
            return null;

        //Use PriorityQueue, it's a sorted queue
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length,
                new Comparator<ListNode>() {
                    @Override
                    public int compare(ListNode a, ListNode b) {
                        if (a.val > b.val)
                            return 1;
                        else if (a.val == b.val)
                            return 0;
                        else
                            return -1;
                    }
                });

        for (ListNode node : lists) {
            if (node != null)
                q.add(node);
        }

        ListNode head = new ListNode(0);
        ListNode p = head;

        while (q.size() > 0) {
            ListNode temp = q.poll();

            p.next = temp;

            if (temp.next != null)
                q.add(temp.next);
            p = p.next;
        }

        return head.next;
    }
}
