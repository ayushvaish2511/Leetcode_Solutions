class Solution {
    public int check(int[] nums, int limit)
    {
        int count = 1;
        int currSum = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            if(currSum + nums[i] <= limit)
            {
                currSum += nums[i];
            }
            else 
            {
                count++;
                currSum = nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0], high = 0;
        for(int i : nums)
        {
            low = low > i ? low : i;
            high += i;
        }
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int cal = check(nums, mid);
            if(cal <= k)
            {
                high = mid-1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return low;
    }
}