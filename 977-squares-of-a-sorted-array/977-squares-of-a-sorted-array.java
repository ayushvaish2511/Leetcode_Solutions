class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int strt = 0, end = nums.length-1;
        int k = nums.length-1;
        while(strt<=end)
        {
            if(nums[strt]*nums[strt] > nums[end]*nums[end])
            {
                ans[k--] = nums[strt] * nums[strt];
                strt++;
            }
            else 
            {
                ans[k--] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}