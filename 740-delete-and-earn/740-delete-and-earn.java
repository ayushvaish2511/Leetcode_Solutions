class Solution {
    public int deleteAndEarn(int[] nums) 
    {
        if(nums.length == 1)
            return nums[0];
        int[] c = new int[10001];
        int max = 0;
        for(int i = 0; i<nums.length; i++)
        {
            c[nums[i]]++;
            if(nums[i] > max)
                max = nums[i];
        }
        int[] sum = new int[10001];
        sum[0] = c[0];
        sum[1] = c[1];
        for(int i = 2; i<10001; i++)
        {
            int temp = sum[i-2] + c[i]*i;
            sum[i] = Math.max(temp, sum[i-1]);
        }
        return sum[max];
    }
}