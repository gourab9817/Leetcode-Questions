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
    public void flatten(TreeNode root) {
        help(root);
    }
    TreeNode nextright;
    public TreeNode help(TreeNode node){
        if(node==null){
            return node;
        }

        help(node.right);
        help(node.left);
        node.left=null;
        node.right=nextright;
        nextright=node;

        return node;


    }
}