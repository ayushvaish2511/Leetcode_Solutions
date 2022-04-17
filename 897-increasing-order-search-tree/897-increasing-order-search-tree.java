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
    TreeNode ans = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {              
        Inorder(root);
        return ans.right;
    }
    public void Inorder(TreeNode root)
    {
        if(root == null)
            return;
        Inorder(root.left);
        ans = create(ans, root.val);
        Inorder(root.right);
        
    }
    public TreeNode create(TreeNode root, int data)
    {
        if(root == null)
            return new TreeNode(data);
        root.right = create(root.right, data);
        return root;
    }
}