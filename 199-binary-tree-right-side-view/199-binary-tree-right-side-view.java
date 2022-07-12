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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null)
            return ans;
        qu.add(root);
        // ans.add(root.val);
        while(!qu.isEmpty())
        {
            int size = qu.size();
            TreeNode p = qu.peek();
            for(int i = 0; i<size; i++)
            {
                p = qu.poll(); 
                if(p.left!=null)
                    qu.add(p.left);
                if(p.right!=null)
                    qu.add(p.right);
            }
            ans.add(p.val);
        }
        return ans;
    }
}