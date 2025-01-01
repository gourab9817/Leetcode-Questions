/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // if(head==null){
            
        // }
        // ListNode temp=head;
        // while(temp.next!=node){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        node.val=node.next.val;
        node.next=node.next.next;
    }
}