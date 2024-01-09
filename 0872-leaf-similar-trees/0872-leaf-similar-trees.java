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
    public ArrayList<Integer> BFS(TreeNode root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(true)
        {
            if(root != null)
            {
                st.push(root);
                root = root.left;
            }
            else 
            {
                if(st.isEmpty())
                    break;
                root = st.peek();
                if(root.left == null && root.right == null)
                    ans.add(root.val);
                st.pop();
                root = root.right;
            }
        }
        return ans;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> t1 = BFS(root1);
        ArrayList<Integer> t2 = BFS(root2);
        if(t1.size() != t2.size())
            return false;
        for(int i = 0; i<t1.size(); i++)
        {
            // System.out.println(t1.get(i) + "= "+ t2.get(i));
            if(t1.get(i) != t2.get(i))
                return false;
        }
        return true;
    }
}