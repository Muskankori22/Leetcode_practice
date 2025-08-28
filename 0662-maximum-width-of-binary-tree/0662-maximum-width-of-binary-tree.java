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

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair<TreeNode, Integer>> qu = new LinkedList<>();
        qu.offer(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!qu.isEmpty()) {
            int currSize = qu.size();
            int firstIdx = qu.peek().getValue(); // leftmost index
            int lastIdx = firstIdx; // will update inside loop

            for (int i = 0; i < currSize; i++) {
                Pair<TreeNode, Integer> curr = qu.poll();
                TreeNode node = curr.getKey();
                int idx = curr.getValue();

                lastIdx = idx; // track last index

                if (node.left != null) {
                    qu.offer(new Pair<>(node.left, 2 * idx + 1));
                }
                if (node.right != null) {
                    qu.offer(new Pair<>(node.right, 2 * idx + 2));
                }
            }

            // width of current level = lastIdx - firstIdx + 1
            maxWidth = Math.max(maxWidth, lastIdx - firstIdx + 1);
        }
        return maxWidth;
    }
}
