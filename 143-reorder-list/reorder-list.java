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
    public static ListNode midNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&& fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    
    }
    public static ListNode reverse(ListNode head){
        ListNode mid=midNode(head);
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reorderList(ListNode head) {
        ListNode mergell=new ListNode(-1);
        ListNode flag=mergell;
        ListNode mid=midNode(head);
        ListNode second=reverse(head);
        ListNode temp=head;
        while(second!=null){
           ListNode tempNext = temp.next; // Save next of the first half
            ListNode secondNext = second.next; // Save next of the reversed second half

            temp.next = second; // Link first half node to second half node
            second.next = tempNext; // Link reversed second half node to next first half node

            temp = tempNext; // Move to the next first half node
            second = secondNext;
        }
        
        
        return head;
    }
}