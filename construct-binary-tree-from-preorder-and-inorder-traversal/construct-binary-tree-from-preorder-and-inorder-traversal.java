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
    public int findInorder(int[] inorder, int search, int strt, int end)
    {
        int i = strt;
        for(i = strt; i<end; i++)
        {
            if(inorder[i] == search)
                break;
        }
        return i;
    }
    int baseIndex = 0;
    public TreeNode BuildTree(int[] preorder, int[] inorder, int strt, int end)
    {
        if(strt > end)
            return null;
        TreeNode node = new TreeNode(preorder[baseIndex++]);
        if(strt == end)
            return node;
        int s = findInorder(inorder, node.val, strt, end);
        node.left = BuildTree(preorder, inorder, strt, s-1);
        node.right = BuildTree(preorder, inorder, s+1, end);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        return BuildTree(preorder, inorder, 0, preorder.length-1);
    }
}