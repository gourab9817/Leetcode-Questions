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
    public static int size(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        if(n==size){
            return head.next;
        }
        ListNode temp=head;
        
        
        
        int m=size-n;

        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

    }
}