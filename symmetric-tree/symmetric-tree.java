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
    public boolean isSymmetric(TreeNode root) 
    {
        //Iterative Approach
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root.left);
        qu.add(root.right);
        while(!qu.isEmpty())
        {
            TreeNode le = qu.remove();
            TreeNode ri = qu.remove();
            if(le == null && ri == null)
                continue;
            else if(le == null || ri == null)
                return false;
            else if(le.val != ri.val)
                return false;
            qu.add(le.left);
            qu.add(ri.right);
            qu.add(le.right);
            qu.add(ri.left);
        }
        return true;
    }
}