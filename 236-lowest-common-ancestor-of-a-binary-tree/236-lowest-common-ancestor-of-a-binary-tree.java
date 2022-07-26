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
    ArrayList<TreeNode> path1 = new ArrayList<>();
    ArrayList<TreeNode> path2 = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        path1.clear();
        path2.clear();
        findPath(root, p, path1);
        findPath(root, q, path2);
        int i = 0;
        for(i = 0; i<path1.size() && i<path2.size(); i++)
        {
            if(!path1.get(i).equals(path2.get(i)))
                break;
        }
        return path1.get(i-1);
    }
    public boolean findPath(TreeNode node, TreeNode n, ArrayList<TreeNode> path)
    {
        if(node == null)
        {
            return false;
        }
        path.add(node);
        if(node == n)
        {
            return true;
        }
        if(node.left!=null && findPath(node.left, n, path))
        {
            return true;
        }
        if(node.right!=null && findPath(node.right, n, path))
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}