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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> al2=new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode x=q.remove();
                al2.add(x.val);
                if(x.left!=null){
                    q.add(x.left);

                }
                if(x.right!=null){
                    q.add(x.right);
                }

            }
            al.add(al2.get(al2.size()-1));

        }
        return al;
    }
}