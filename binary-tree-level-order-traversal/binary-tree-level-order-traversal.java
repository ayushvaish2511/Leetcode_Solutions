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
            int n = qu.size();
            List<Integer> lvl = new ArrayList<>();
            for(int i = 0; i<n; i++)
            {
                TreeNode curr = qu.poll(); 
                if(curr.left!=null)
                    qu.add(curr.left);
                if(curr.right!=null)
                    qu.add(curr.right);
                lvl.add(curr.val);
            }
            ans.add(lvl);            
        }
        return ans;
    }
}