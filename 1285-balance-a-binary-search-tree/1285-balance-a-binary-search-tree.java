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
    public void helper(TreeNode root,ArrayList<Integer> li)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,li);
        li.add(root.val);
        helper(root.right,li);
    }
    public TreeNode Construct(ArrayList<Integer> li,int s,int e)
    {
      if(s>e)
      {
        return null;
      }
        int mid = (s+e)/2;
        TreeNode node = new TreeNode(li.get(mid));
        node.left =Construct(li,s,mid-1);
        node.right = Construct(li,mid+1,e);
        return node; 
      
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        helper(root,li);
        return Construct(li,0,li.size()-1);
    }
}