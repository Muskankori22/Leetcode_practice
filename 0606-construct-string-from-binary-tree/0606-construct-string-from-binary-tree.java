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
    public String tree2str(TreeNode root) {
        if(root==null)
        {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        dfs(root,ans);
        return ans.toString();
    }
    private void dfs(TreeNode root,StringBuilder ans)
    {
        if(root==null)
        {
            return;
        }
        ans.append(root.val);
        if(root.left!=null || root.right!=null)
        {
            ans.append("(");
            dfs(root.left,ans);
            ans.append(")");

            if(root.right!=null){
                ans.append("(");
                dfs(root.right,ans);
                ans.append(")");
            }
        }
    }
}