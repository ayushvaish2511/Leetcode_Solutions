class Solution {
    public int minMoves2(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int median = 0;
        if(n%2==0)
        {
            median = (nums[n/2 - 1] + nums[n/2])/2;
        }
        else 
        {
            median = nums[(n+1)/2 - 1];
        }
        int ans = 0;
        for(int i = 0; i<n; i++)
        {
            ans += (int)Math.abs(nums[i] - median);
        }
        return ans;
    }
}