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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al =new ArrayList<>();
        
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> al2=new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode a=q.remove();
                al2.add(a.val);
                if(a.left!=null){
                    q.add(a.left);
                }
                if(a.right!=null){
                    q.add(a.right);
                }
            }
            
            al.add(al2);
        }
        return al;
    }
}