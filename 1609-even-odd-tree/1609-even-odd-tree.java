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
    public boolean isEvenOddTree(TreeNode root) 
    {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int level = 0;
        while(!qu.isEmpty())
        {
            int size = qu.size();
            if(level%2==0)
            {
                int[] arr = new int[size];
                for(int i = 0; i<size; i++)
                {
                    TreeNode p = qu.poll();
                    if(p.val % 2 == 0)
                    {
                        return false;
                    }
                    arr[i] = p.val;
                    if(p.left != null)
                    {
                        qu.add(p.left);
                    }
                    if(p.right != null)
                    {
                        qu.add(p.right);
                    }
                }
                for(int i = 1; i<size; i++)
                {
                    if(arr[i] <= arr[i-1])
                        return false;
                }
            }
            if(level%2!=0)
            {
                int[] arr = new int[size];
                for(int i = 0; i<size; i++)
                {
                    TreeNode p = qu.poll();
                    if(p.val % 2 != 0)
                    {
                        return false;
                    }
                    arr[i] = p.val;
                    if(p.left != null)
                    {
                        qu.add(p.left);
                    }
                    if(p.right != null)
                    {
                        qu.add(p.right);
                    }
                }
                for(int i = 1; i<size; i++)
                {
                    if(arr[i] >= arr[i-1])
                        return false;
                }
            }
            level++;
        }
        return true;
    }
}