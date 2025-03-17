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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans =  new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null)
        {
            return ans;
        }
        qu.offer(root);
        while(!qu.isEmpty())
        {
            double size = qu.size();
             double value = 0;
            for(int i=0;i<size;i++)
            {
                TreeNode node = qu.poll();
                value+=node.val; 
                if(node.left!=null)
                {
                    qu.offer(node.left);
                }
                if(node.right!=null)
                {
                    qu.offer(node.right);
                }
               
            }
            ans.add(value/size);
        }
        return ans;
    }
}