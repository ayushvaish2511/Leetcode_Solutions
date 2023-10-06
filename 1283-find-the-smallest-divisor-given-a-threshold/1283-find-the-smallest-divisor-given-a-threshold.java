class Solution {
    public int check(int[] nums, int mid)
    {
        int sum = 0;
        for(int i : nums)
        {
            sum += Math.ceil(i*1.0/mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = nums[0];
        for(int i : nums)
        {
            high = high > i ? high : i;
        }
        int ans = high;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int ch = check(nums, mid);
            if(ch <= threshold)
            {
                ans = ans < mid ? ans : mid;
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return ans;
    }
}