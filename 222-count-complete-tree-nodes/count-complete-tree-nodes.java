/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count=1;
        // while(root.left!=null || root.right!=null){
        //     count++
        //     root=root.left;

        // }
        int count1=countNodes(root.left);
        int count2=countNodes(root.right);
        int total=count1+count2+1;
        return total;
        
    }
}