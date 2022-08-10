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
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return Converted(nums, 0, nums.length-1);    
    }
    public TreeNode Converted(int[] nums, int strt, int end)
    {
        if(strt > end)
            return null;
        int mid = (strt + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = Converted(nums, strt, mid-1);
        node.right = Converted(nums, mid+1, end);
        return node;
    }
}