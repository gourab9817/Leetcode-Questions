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
    public int getDecimalValue(ListNode head) {
        int n=size(head);
        int m=n-1;
        ListNode temp=head;
        int sum=0;int a=0;
        for(int i=0;i<n;i++){
            if(temp.val==1){
                a=(int)Math.pow(2,m-i);
                sum+=a;
            }
            temp=temp.next;
            
        }
        return sum;
    }
}