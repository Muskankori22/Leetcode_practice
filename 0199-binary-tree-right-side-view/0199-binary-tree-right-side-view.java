/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        qu.offer(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            while (size > 0) {
                TreeNode node = qu.poll();
                if (node.left != null) {
                    qu.offer(node.left);
                }
                if (node.right != null) {
                    qu.offer(node.right);
                }
                size--;
                if (size == 0) {
                    ans.add(node.val);
                }
            }
        }
        return ans;
    }
}