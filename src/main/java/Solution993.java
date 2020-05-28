import java.util.*;

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
public class Solution993 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private class Entry {
        public TreeNode parent;
        public TreeNode node;
        public int level;

        public Entry(TreeNode parent, TreeNode node, int level) {
            this.parent = parent;
            this.node = node;
            this.level = level;
        }
    };

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Entry> q = new LinkedList<>();
        q.add(new Entry(null, root, 0));

        Entry X = null;
        Entry Y = null;

        // Short-circuit works due to problem constraints (vs !q.isEmpty).
        while (X == null || Y == null) {
            Entry e = q.poll();

            if (e.node.val == x) X = e;
            else if (e.node.val == y) Y = e;

            if (e.node.left != null) q.add(new Entry(e.node, e.node.left, e.level + 1));
            if (e.node.right != null) q.add(new Entry(e.node, e.node.right, e.level + 1));
        }

        return X.level == Y.level && X.parent != Y.parent;
    }
}
