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
    public int maxsum = Integer.MIN_VALUE;
    public int findSum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum = findSum(root.left);
        int rightsum = findSum(root.right);
        leftsum = Math.max(leftsum,0);
        rightsum = Math.max(rightsum,0);
        int currentsum = leftsum + rightsum + root.val;
        maxsum = Math.max(maxsum,currentsum);
        return Math.max(leftsum,rightsum)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        findSum(root);
        return maxsum;
    }
}