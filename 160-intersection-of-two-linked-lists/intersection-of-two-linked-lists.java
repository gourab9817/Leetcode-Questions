/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        ArrayList<ListNode> al1=new ArrayList<>();
        while(temp1!=null){
            al1.add(temp1);
            temp1=temp1.next;
        }
        ArrayList<ListNode> al2=new ArrayList<>();
        while(temp2!=null){
            al2.add(temp2);
            temp2=temp2.next;
        }
        ListNode x=null;
        for(int i=0;i<al1.size();i++){
            for(int j=0;j<al2.size();j++){
                if(al1.get(i).equals(al2.get(j))){
                    x=al1.get(i);
                    return x;
                }
            }
        }
        return null;
    }
}