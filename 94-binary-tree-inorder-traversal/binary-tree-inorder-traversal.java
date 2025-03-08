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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        inorder(li,root);
        return li;
        
    }
    public static void inorder(ArrayList<Integer> li , TreeNode root){
            if(root==null){
                return;
            }
            inorder(li,root.left);
            li.add(root.val);
            inorder(li,root.right);
        }
}