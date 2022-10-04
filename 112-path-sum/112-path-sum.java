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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        return solve(root, targetSum, 0);
    }
    public boolean solve(TreeNode root, int targetSum, int sum)
    {
        if(root == null)
            return false;
        if(root.val + sum == targetSum && (root.left == null && root.right == null))
            return true;
        boolean left = solve(root.left, targetSum, root.val + sum);
        boolean right = solve(root.right, targetSum, root.val + sum);
        if(left || right)
            return true;
        return false;
    }
}