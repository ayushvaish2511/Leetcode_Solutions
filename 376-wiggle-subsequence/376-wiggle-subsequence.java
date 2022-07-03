class Solution {
    public int wiggleMaxLength(int[] nums) 
    {
        int i = 1;
        while(i<nums.length && nums[i-1] == nums[i])
        {
            i++;
        }
        if(i == nums.length)
        {
            return 1;
        }
        boolean dir = nums[i] > nums[i-1];
        int ans = 1;
        for( ; i<nums.length; i++)
        {
            if((dir && nums[i] > nums[i-1]) || (!dir && nums[i] < nums[i-1]))
            {
                dir = !dir;
                ans++;
            }
        }
        return ans;
    }
}