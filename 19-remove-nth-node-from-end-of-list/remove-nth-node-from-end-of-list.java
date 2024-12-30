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

    public int calculateSize(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = calculateSize(head);
        if(n==size){
            return head.next;
        }
        int m=size-n;
        ListNode temp=head;
        
        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}