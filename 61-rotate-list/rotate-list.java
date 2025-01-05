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
        ListNode temp=head;
        
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode temp2=null;
        int n=size(head);
        if(head==null || head.next==null ||n==k){
            return head;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        int m=n-k;
        
        int i=0;
        while(i<m-1){
            temp=temp.next;
            i++;
        }
        ListNode second=temp.next;
        temp2=second;
        temp.next=null;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;

        return second;
    }
}