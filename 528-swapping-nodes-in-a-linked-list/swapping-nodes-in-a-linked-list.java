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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1=head;
        ListNode temp2=head;

        int n=size(head);
        
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }
        for(int i=1;i<=n-k;i++){
            temp2=temp2.next;
        }
        int x=temp2.val;
        temp2.val=temp1.val;
        temp1.val=x;
        return head;
    }
}