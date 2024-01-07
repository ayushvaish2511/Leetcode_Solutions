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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null)
            st.push(root);
        while(!st.isEmpty())
        {
            TreeNode p = st.pop();
            preorder.add(p.val);
            if(p.right != null)
                st.push(p.right);
            if(p.left != null)
                st.push(p.left);
        }
        return preorder;
    }
}