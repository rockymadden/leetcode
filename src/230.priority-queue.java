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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            q.add(root.val);
            if (root.left != null) stack.push(root.left);
            if (root.right != null) stack.push(root.right);
        }

        while (--k > 0) q.remove();

        return q.remove();
    }
}
