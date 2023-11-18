class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0] = nums[0];
        for(int i = 1; i<n; i++)
        {
            pre[i] = pre[i-1] < nums[i] ? pre[i-1] : nums[i];
        }
        post[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--)
        {
            post[i] = post[i+1] > nums[i] ? post[i+1] : nums[i];
        }
        for(int i = 1; i<n-1; i++)
        {
            if(nums[i] > pre[i] && nums[i] < post[i+1])
                return true;
        }
        return false;
    }
}