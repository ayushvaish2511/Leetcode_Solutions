class Solution {
    public int findDuplicate(int[] nums) {
        int ans;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[Math.abs(nums[i])- 1] < 0)
                return Math.abs(nums[i]);
            nums[Math.abs(nums[i])-1] = 0 - nums[Math.abs(nums[i])-1]; 
        }
        return -1;
    }
}