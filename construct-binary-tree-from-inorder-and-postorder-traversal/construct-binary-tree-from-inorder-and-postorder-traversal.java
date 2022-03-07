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
    public int findInorder(int[] inorder, int key, int strt, int end)
    {
        int i = strt;
        for( ; i<=end; i++)
        {
            if(inorder[i] == key)
                return i;
        }
        return i;
    }
    public TreeNode Build(int[] inorder, int[] postorder, int inStrt, int inEnd, int postStrt, int postEnd)
    {
        if(inStrt > inEnd)
            return null;
        TreeNode node = new TreeNode(postorder[postEnd]);
        if(inStrt == inEnd)
            return node;
        int ss = findInorder(inorder, node.val, inStrt, inEnd);
        node.left = Build(inorder, postorder, inStrt, ss-1, postStrt, postStrt - inStrt + ss - 1);
        node.right = Build(inorder, postorder, ss+1, inEnd, postEnd - inEnd + ss, postEnd-1);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return Build(inorder, postorder, 0, inorder.length-1, 0, inorder.length-1);        
    }
}