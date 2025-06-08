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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        List<List<Integer>> al2=new ArrayList<>();
        al=levelOrder(root);
        for(int i=0;i<al.size();i++){
            if(i%2==0){
                al2.add(al.get(i));
            }else{
                al2.add(reverselist(al.get(i)));
            }
        }
        return al2;

    }
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
    public List<Integer> reverselist(List<Integer> a){
        List<Integer> ax= new ArrayList<>();
        for (int i=a.size()-1;i>=0;i--){
            ax.add(a.get(i));
        }
        return ax;
    }
}