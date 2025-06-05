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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null || subRoot==null ){
            return false;
        }
        if(root.val==subRoot.val){
            int a=countNodes(root);
            int b=countNodes(subRoot);
            if(a==b){
                if(isSame(root,subRoot)){
                return true;
            }
            }
            
            
        }
        boolean left=isSubtree(root.left,subRoot);
        boolean right=isSubtree(root.right,subRoot);
        return left||right;

    }
    public boolean isSame(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot==null){
            return true;
        }else if(root==null ||subRoot==null|| root.val!=subRoot.val){
            return false;
        }
        if(!isSame(root.left,subRoot.left)){
            return false;
        }
        if(!isSame(root.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count1=countNodes(root.left);
        int count2=countNodes(root.right);
        int total=count1+count2+1;
        return total;
        
    }

}