class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] ans = new int[nums.length];
        int strt = 0, end = nums.length-1;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
                ans[strt++] = nums[i];
            else
                ans[end--] = nums[i];
        }
        return ans;
    }
}