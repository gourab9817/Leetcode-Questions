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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if (k > count || k <= 0) { 
            return head;
        }
        temp=head;
        int lk=count-k+1;
        ListNode a=head;
        for(int i=1;i<k;i++){
            
            temp=temp.next;
        }
        a=temp;
        temp=head;
        ListNode b=head;
        for(int i=1;i<lk;i++){
            
            temp=temp.next;
        }
        b=temp;
        int x=a.val;
        a.val=b.val;
        b.val=x;
        return head;
    }
}