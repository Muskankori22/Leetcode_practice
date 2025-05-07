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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
        {
            return -1;
        }
        int second = solve(root,root.val);
        return second;
    }
    public int solve(TreeNode root,int parentval)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.val>parentval)
        {
            return root.val;
        }
        int left = solve(root.left,root.val);
        int right = solve(root.right,root.val);
        if(left==-1) return right;
        if(right==-1) return left;
        if(left==-1 && right==-1) return -1;
        return Math.min(left,right);
    }
}