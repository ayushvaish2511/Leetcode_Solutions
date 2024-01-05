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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++)
            {
                TreeNode p = qu.poll();
                if(p.left != null)
                {
                    qu.add(p.left);
                }
                if(p.right != null)
                {
                    qu.add(p.right);
                }
                temp.add(p.val);
            }
            ans.add(temp);
        }
        return ans;
    }
}