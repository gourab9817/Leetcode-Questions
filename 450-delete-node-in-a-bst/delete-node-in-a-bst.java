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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left= deleteNode(root.left,key);
        }else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            //case 1=no left
            if(root.left==null){
                return root.right;
            }
            //case 2=no right
            if(root.right==null){
                return root.left;
            }
            //case 3= both left and right
            TreeNode newnode=inorder(root);
            root.val=newnode.val;
            root.right = deleteNode(root.right, newnode.val);


            
           

        }
        return root;
       
    }
     public TreeNode inorder(TreeNode root){
            root=root.right;
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
}