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
    public boolean sametree(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null || q==null)
        {
            return false;
        }
        if(p.val!=q.val)
        {
            return false;
        }
        return sametree(p.left,q.left) && sametree(p.right,q.right);
    }
    public TreeNode symetric(TreeNode root)
    {
        if(root==null)
        {
            return root;
        }
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = symetric(r);
        root.right = symetric(l);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }
          root.left=symetric(root.left);
         return sametree(root.left,root.right);
    }
}