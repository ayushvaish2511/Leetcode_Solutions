class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) 
    {
        for(int i = 1; i<nums.length; i++)
        {
            nums[i] = nums[i] ^ nums[i-1];
        }
        int ans[] = new int[nums.length];
        int c = 0;
        int ma = (int)Math.pow(2, maximumBit) - 1;
        for(int i = nums.length-1; i>=0; i--)
        {
            ans[c++] = nums[i] ^ ma;
        }
        return ans;
    }
}