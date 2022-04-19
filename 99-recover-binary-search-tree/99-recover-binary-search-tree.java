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
class Solution 
{
    TreeNode first;
    TreeNode mid;
    TreeNode last;
    TreeNode prev;
    public void recoverTree(TreeNode root) 
    {
        first = null;
        mid = null;
        last = null;
        solve(root);
        if(first!=null && last!=null)
        {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        else if(first!=null && mid!=null)
        {
            int temp = first.val;
            first.val = mid.val;
            mid.val = temp;
        }
    }
    public void solve(TreeNode root)
    {
        if(root == null)
            return;
        solve(root.left);
        if(prev!=null && root.val < prev.val)
        {
            if(first == null)
            {
                first = prev;
                mid = root;
            }
            else 
            {
                last = root;
            }
        }
        prev = root;
        solve(root.right);
    }
}