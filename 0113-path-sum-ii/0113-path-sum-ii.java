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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helperFunc(root, targetSum, new ArrayList<>());
        return result;
    }

    private void helperFunc(TreeNode node, int targetSum, List<Integer> path) {
        // Base case
        if (node == null) {
            return;
        }

        // Add the current node to the path
        path.add(node.val);

        // Check if we've reached a leaf node
        if (node.left == null && node.right == null) {
            if (sum(path) == targetSum) {
                result.add(new ArrayList<>(path));
            }
        }

        // Explore left and right subtrees
        helperFunc(node.left, targetSum, path);
        helperFunc(node.right, targetSum, path);

        // Backtrack
        path.remove(path.size() - 1);
    }

    // Computes the sum of the current path
    private int sum(List<Integer> path) {
        int sum = 0;
        for (int value : path) {
            sum += value;
        }
        return sum;
    }
}