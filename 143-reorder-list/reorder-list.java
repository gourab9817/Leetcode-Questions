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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null || head.next.next==null){
            return ;
        }
        //get the mid and broke 2nd part
        ListNode temp=head;
        ListNode mid=help(head);
        ListNode second=mid.next;
        mid.next=null;
        //reverse 2nd 
        ListNode head2=reverse(second);
        while(head2!=null ){
            ListNode t2=temp.next;
            ListNode t3=head2.next;
            temp.next=head2;
            head2.next=t2;
            head2=t3;
            temp=t2;

        }
        
    }
    public static ListNode help(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp1=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        temp1 =slow;
        // ListNode temp2=slow.next;
        // reverse(temp);
        return temp1;

    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
}