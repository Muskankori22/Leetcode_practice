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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        boolean lefttoright=true;
        if(root==null)
        {
            return res;
        }
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            List<Integer> ans = new LinkedList<>();
            for(int i=0;i<size;i++)
            {
               TreeNode temp = qu.poll();
               if(lefttoright)
               {
                ans.add(temp.val);
               }
               else{
                ans.add(0,temp.val);
               }
               if(temp.left!=null)
               {
                qu.offer(temp.left);
               }
               if(temp.right!=null)
               {
                qu.offer(temp.right);
               }
            }
            res.add(ans);
           lefttoright = !lefttoright; 
        }
        return res;
    }
}