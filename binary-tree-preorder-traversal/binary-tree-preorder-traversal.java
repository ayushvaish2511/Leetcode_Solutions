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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<TreeNode> sta = new Stack<>();
        TreeNode curr = root;
        while(curr!=null || !sta.isEmpty())
        {
            while(curr!=null)
            {
                ans.add(curr.val);
                if(curr.right!=null)
                    sta.push(curr.right);
                curr = curr.left;
            }
            if(!sta.isEmpty())
                curr = sta.pop();
        }
        return ans;
    }
}