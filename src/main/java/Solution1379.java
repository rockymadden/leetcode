import java.util.*;

public class Solution1379 {
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

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;

        final Queue<TreeNode> q = new LinkedList<>();

        q.offer(original);
        q.offer(cloned);

        while (!q.isEmpty()) {
            int size = q.size() / 2;

            for (int i = 0; i < size; i++) {
                final TreeNode curr = q.poll();
                final TreeNode currc = q.poll();

                if (curr == target) return currc;
                else {
                    if (curr.left != null) {
                        q.offer(curr.left);
                        q.offer(currc.left);
                    }

                    if (curr.right != null) {
                        q.offer(curr.right);
                        q.offer(currc.right);
                    }
                }
            }
        }

        return null;
    }
}
