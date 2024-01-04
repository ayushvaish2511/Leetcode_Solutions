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
    public void inorder(List<Integer> inor, TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorder(inor, root.left);
        inor.add(root.val);
        inorder(inor, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorder(in, root);
        return in;
    }
}