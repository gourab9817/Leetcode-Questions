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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        preorder(li,root);
        return li;
        
    }
    public static void preorder(ArrayList<Integer> li , TreeNode root){
            if(root==null){
                return;
            }
            li.add(root.val);
            preorder(li,root.left);
           
            preorder(li,root.right);
             
        
    }
}