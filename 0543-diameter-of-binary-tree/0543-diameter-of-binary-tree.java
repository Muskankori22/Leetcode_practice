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
    int diameter = 0;
    public int findDiameter(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftdia = findDiameter(root.left);
        int rightdia = findDiameter(root.right);
        int currdia = leftdia + rightdia;
        diameter = Math.max(diameter,currdia);
        return Math.max(leftdia,rightdia)+1;
   }
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return diameter;
    }
}