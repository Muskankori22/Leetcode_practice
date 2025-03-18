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
    public int findSum(TreeNode root,int pathSum)
    {
        if(root==null)
        {
            return 0;
        }
        pathSum = pathSum * 10 + root.val;
        if(root.left==null && root.right==null)
        {
            return pathSum;
        }
        return findSum(root.left,pathSum)+findSum(root.right,pathSum);
    }
    public int sumNumbers(TreeNode root) {
      return findSum(root,0);
    }
}