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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> qu = new LinkedList<>();
        int sum = 0;
        if(root!=null)
        qu.add(root);
        while(!qu.isEmpty())
        {
            TreeNode p = qu.poll();
            if(p.val >= low && p.val <= high)
                sum += p.val;
            if(p.left!=null)
                qu.add(p.left);
            if(p.right!=null)
                qu.add(p.right);
        }
        return sum;
    }
}