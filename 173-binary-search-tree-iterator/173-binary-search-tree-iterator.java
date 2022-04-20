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
class BSTIterator {
    Queue<Integer> qu = new LinkedList<>();
    public BSTIterator(TreeNode root) 
    {
        inOrder(root);
    }
    
    public int next() 
    {
        return qu.remove();   
    }
    
    public boolean hasNext() 
    {
        return !qu.isEmpty();
    }
    public void inOrder(TreeNode root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        qu.add(root.val);
        inOrder(root.right);
   }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */