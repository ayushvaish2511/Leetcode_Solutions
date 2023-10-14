class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            long min = nums[i];
            long max = nums[i];
            for(int j = i+1; j<n; j++)
            {
                min = min < nums[j] ? min : nums[j];
                max = max > nums[j] ? max : nums[j];
                ans += (max-min);
            }            
        }
        return ans;
    }
}