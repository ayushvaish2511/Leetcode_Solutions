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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            List<Integer> li = new ArrayList<>();
            for(int i = 0; i<size; i++)
            {
                TreeNode p = qu.poll();
                li.add(p.val);
                if(p.left!=null)
                    qu.add(p.left);
                if(p.right!=null)
                    qu.add(p.right);
            }
            ans.add(li);
        }
        return ans;
    }
}