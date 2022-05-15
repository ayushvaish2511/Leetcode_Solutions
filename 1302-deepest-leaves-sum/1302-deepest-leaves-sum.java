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
    public int deepestLeavesSum(TreeNode root) 
    {
        Queue<TreeNode> qu = new LinkedList<>();
        int ans = 0;
        int qlen = 0;
        qu.add(root);
        while(!qu.isEmpty())
        {
            ans = 0;
            qlen = qu.size();
            for(int i = 0; i<qlen; i++)
            {
                TreeNode p = qu.poll();
                ans += p.val;
                if(p.left!=null)
                    qu.add(p.left);
                if(p.right!=null)
                    qu.add(p.right);
            }
        }
        return ans;
    }
}