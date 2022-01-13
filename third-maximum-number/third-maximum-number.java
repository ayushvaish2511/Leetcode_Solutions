class Solution {
    public int thirdMax(int[] nums) 
    {
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
        {
            return (int)Math.max(nums[0], nums[1]);
        }
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] > max)
            {
                tmax = smax;
                smax = max;
                max = nums[i];
            }
            else if(nums[i] > smax && nums[i] < max)
            {
                tmax = smax;
                smax = nums[i];
            }
            else if(nums[i] > tmax && nums[i] < smax)
            {
                tmax = nums[i];
            }
        }
        if(tmax == Long.MIN_VALUE)
            return (int)max;
        return (int)tmax;
    }
}