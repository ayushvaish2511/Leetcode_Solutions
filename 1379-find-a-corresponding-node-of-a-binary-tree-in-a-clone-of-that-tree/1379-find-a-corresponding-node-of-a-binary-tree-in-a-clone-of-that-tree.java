/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) 
    {
        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode t = cloned;
        qu.add(t);
        while(!qu.isEmpty())
        {
                TreeNode temp = qu.poll();
                if(temp.val == target.val)
                {
                    return temp;
                }
                if(temp.left != null)
                    qu.add(temp.left);
                if(temp.right != null)
                    qu.add(temp.right);
            
        }
        return null;
    }    
}