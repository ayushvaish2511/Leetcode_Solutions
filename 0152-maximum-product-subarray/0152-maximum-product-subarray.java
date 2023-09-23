class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(pre == 0)
            {
                pre = 1;
            }
            if(suff == 0)
            {
                suff = 1;
            }
            pre *= nums[i];
            suff *= nums[n-i-1];
            int max = pre > suff ? pre : suff;
            ans = ans > max ? ans : max;
        }
        return ans;
    }
}