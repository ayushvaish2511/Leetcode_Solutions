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
    int count = 0;
    public int minCameraCover(TreeNode root) 
    {
        int ans = dfs(root);
        if(ans == 2)
            return count + 1;
        return count;
    }
    public int dfs(TreeNode root)
    {
        if(root == null)
        {
            return 1;
        }
        int L = dfs(root.left);
        int R = dfs(root.right);
        if(L == 1 && R == 1)
            return 2;
        else if(L == 2 || R == 2)
        {
            count++;
            return 3;
        }
        else
            return 1;
    }
}