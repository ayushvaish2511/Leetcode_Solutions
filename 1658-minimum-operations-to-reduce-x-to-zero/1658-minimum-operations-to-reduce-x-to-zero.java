class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
        }
        int maxL = -1;
        if(sum < x)
        {
            return -1;
        }
        int strt = 0, end = 0, currSum = 0;
        while(end < nums.length)
        {
            currSum += nums[end];
            while(currSum > sum-x && strt<=end)
            {
                currSum -= nums[strt];
                strt++;
            }
            if(currSum == sum-x)
            {
                maxL = Math.max(maxL, end-strt+1);
            }
            end++;
        }
        if(maxL == -1)
        {
            return -1;
        }
        return nums.length - maxL;
    }
}