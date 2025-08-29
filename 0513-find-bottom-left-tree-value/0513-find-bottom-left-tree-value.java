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
    public int findBottomLeftValue(TreeNode root) {
        int res = 0;
      if(root==null)
      {
        return res;
      }  
      Queue<TreeNode> qu = new LinkedList<>();
      qu.offer(root);
      while(!qu.isEmpty())
      {
        int size = qu.size();
       Queue<Integer> temp = new LinkedList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode node = qu.poll();
            if(node.left!=null)
            {
                qu.add(node.left);
            }
            if(node.right!=null)
            {
                qu.add(node.right);
            }
            temp.add(node.val);
        }
        res=temp.peek();
      }
      return res;
    }
}