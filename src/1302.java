/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {    
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int count = 0;
        int sum = 0;
        
        // Find sum via level-order traversal.
        while (true) {
            count = q.size();

            if (count == 0) { return sum; }
            
            // Reset sum for the next level.
            sum = 0;
            
            while (count > 0) {
                root = q.poll();
                sum += root.val;
                count--;
                
                if (root.left != null) { q.add(root.left); }
                if (root.right != null) { q.add(root.right); }
            }
        }
    }
}