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
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int lk=count-n;
        if (lk == 0) {
    return head.next;
}
        ListNode dummy=head;
        for(int i=1;i<lk;i++){
            temp=temp.next;
        }
        dummy=temp;
        dummy.next=dummy.next.next;
        return head;

    }
}