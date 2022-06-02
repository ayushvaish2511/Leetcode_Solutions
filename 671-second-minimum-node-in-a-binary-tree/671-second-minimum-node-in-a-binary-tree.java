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
    public int findSecondMinimumValue(TreeNode root) 
    {
        Queue<TreeNode> qu = new LinkedList<>();
        HashSet<Integer> hs = new HashSet<>();
        int min = root.val;
        int second_min = Integer.MAX_VALUE;
        qu.add(root);
        while(!qu.isEmpty())
        {
            TreeNode p = qu.poll();
            if(p.left!=null)
            {
                qu.add(p.left);
                qu.add(p.right);
            }
            hs.add(p.val);
            if(p.val > min && p.val < second_min)
                second_min = p.val;
        }
        if(hs.size() >= 2)
            return second_min;
        return -1;
    }
}