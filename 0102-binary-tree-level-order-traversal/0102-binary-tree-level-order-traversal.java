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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
      if(root==null)
      {
        return res;
      }  
      Queue<TreeNode> qu = new LinkedList<>();
      qu.offer(root);
      while(!qu.isEmpty())
      {
        int size = qu.size();
        ArrayList<Integer> temp = new ArrayList<>();
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
        res.add(temp);
      }
      return res;
    }
}