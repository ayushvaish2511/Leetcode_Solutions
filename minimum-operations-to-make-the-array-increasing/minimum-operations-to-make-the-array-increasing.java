class Solution {
    public int minOperations(int[] nums) 
    {
        int ans = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i+1]<=nums[i])
            {
                ans = ans + (nums[i]+1 - nums[i+1]);
                nums[i+1] = nums[i] + 1;                
            }
        }
        return ans;
    }
}