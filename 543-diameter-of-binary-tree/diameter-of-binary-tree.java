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
     int d =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int h= maxDepth(root);
        return d;
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else
        {
            int l=maxDepth(root.left);
            int r=maxDepth(root.right);
            d=Math.max(d,l+r);
            return 1+Math.max(l,r);
        }
        //d=Math.max(d,(maxDepth(root.left)+maxDepth(root.right)));
        //return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}