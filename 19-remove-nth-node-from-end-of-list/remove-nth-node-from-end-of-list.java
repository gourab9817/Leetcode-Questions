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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        if(head==null){
            return head;
        }
        
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        if (n == count) {
            return head.next;
        }

        int k=count-n;
        
        ListNode temp2=head;
        for(int i=1;i<k;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        
        return head;

    }
}