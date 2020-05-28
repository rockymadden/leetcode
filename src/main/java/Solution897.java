import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution897 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        traverse(root, vals);
        TreeNode ans = new TreeNode(0);
        TreeNode i = ans;

        for(int v : vals) {
            i.right = new TreeNode(v);
            i = i.right;
        }

        return ans.right;
    }

    public void traverse(TreeNode node, List<Integer> vals) {
        if(node == null) return;
        traverse(node.left, vals);
        vals.add(node.val);
        traverse(node.right, vals);
    }
}
