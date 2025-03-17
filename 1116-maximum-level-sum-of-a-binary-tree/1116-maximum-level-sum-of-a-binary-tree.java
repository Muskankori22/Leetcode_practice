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
    public int maxLevelSum(TreeNode root) {
     int maxsum = Integer.MIN_VALUE;
     Queue<TreeNode> qu = new LinkedList<>();
     int level = 1;
     int maxlevel = 1;
     if(root==null)
     {
        return 0;
     }
     qu.offer(root);
     while(!qu.isEmpty())
     {
        int size = qu.size();
        int levelsum = 0;
        for(int i=0;i<size;i++)
        {  
            TreeNode node = qu.poll();
            levelsum+=node.val;
            if(node.left!=null)
            {
                qu.add(node.left);
            }
            if(node.right!=null)
            {
                qu.add(node.right);
            }
        }
        if(levelsum > maxsum)
        {
            maxsum = levelsum;
            maxlevel = level;
        }
        level++;
     }
     return maxlevel;
    }
}