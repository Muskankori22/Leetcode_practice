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
    public void helper(TreeNode root,Queue<Integer> qu)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,qu);
        qu.add(root.val);
        helper(root.right,qu);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li = new ArrayList<>();
        Queue<Integer> qu1 = new LinkedList<>();
        Queue<Integer> qu2 = new LinkedList<>();
        helper(root1,qu1);
        helper(root2,qu2);
        while(!qu1.isEmpty() && !qu2.isEmpty())
        {
            if(qu1.peek()<qu2.peek())
            {
                li.add(qu1.poll());
            }
            else{
                li.add(qu2.poll());
            }
        }
        while(!qu1.isEmpty())
        {
            li.add(qu1.poll());
        }
        while(!qu2.isEmpty())
        {
            li.add(qu2.poll());
        }
        return li;
    }
}