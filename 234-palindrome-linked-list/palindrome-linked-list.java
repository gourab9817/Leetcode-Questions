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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        //edgecase solve
        if(head==null ||head.next==null){
            return true;
        }
        // #Step1 find the middle node 
        ListNode mid=middle(head);

        // step 2 reverse the second half of the list
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 

        // step 3 check 1st half is equal to 2nd half or not 
        ListNode left =head;
        ListNode right=prev;
        while(right!=null){
            if(left.val!=right.val)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
}