/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle and split the list
        ListNode middle = mid(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        // Recursively sort both halves
        ListNode first = sortList(head);
        ListNode last = sortList(secondHalf);

        // Merge sorted halves
        return merge(first, last);
    }

    public static ListNode merge(ListNode first, ListNode last) {
        ListNode dummy = new ListNode(-1); // Dummy node to simplify merging
        ListNode current = dummy;

        while (first != null && last != null) {
            if (first.val <= last.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = last;
                last = last.next;
            }
            current = current.next;
        }

        // Append remaining nodes
        if (first != null) {
            current.next = first;
        } else {
            current.next = last;
        }

        return dummy.next;
    }
}
