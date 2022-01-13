class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int maxc = 0;
        int c = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                if(c>maxc)
                   maxc = c;
                c = 0;
            }
            else 
            {
                c++;
            }
        }
        if(c>maxc)
            maxc = c;
        return maxc;
    }
}