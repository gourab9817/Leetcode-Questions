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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> xl=levelorder( root);
        List<List<Integer>> ql=new ArrayList<>();
        int size=xl.size();
        for(int i=size-1;i>=0;i--){
            ql.add(xl.get(i));
        }
        return ql;
        
    }
    public List<List<Integer>> levelorder(TreeNode root){
        
        List<List<Integer>> al=new  ArrayList<>();
        // List<Integer> bl=new ArrayList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            
            List<Integer> bl=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                bl.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            al.add(bl);
        }
        return al;

    }
}