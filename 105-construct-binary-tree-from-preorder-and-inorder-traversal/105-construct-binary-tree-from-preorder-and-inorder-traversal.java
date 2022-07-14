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
    int index = 0;
    public int find(int[] in, int target, int strt, int end)
    {
        int i = strt;
        for( ; i<=end; i++)
        {
            if(in[i] == target)
                return i;
        }
        return i;
    }
    public TreeNode Build(int[] p, int[] in, int strt, int end)
    {
        if(strt > end)
            return null;
        TreeNode node = new TreeNode(p[index++]);
        if(strt == end)
            return node;
        int s = find(in, node.val, strt, end);
        node.left = Build(p, in, strt, s-1);
        node.right = Build(p, in, s+1, end);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        return Build(preorder, inorder, 0, preorder.length-1);    
    }
}