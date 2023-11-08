class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, strt = 0, end = -1, convert = 0;
        for(int i = 0; i<nums.length; i++)
        {
            
            if(nums[i] == 1)
            {
                end++;
            }
            else 
            {
                if(convert < k)
                {
                    convert++;
                    end++;
                }
                else 
                {
                    while(nums[strt] == 1)
                    {
                        strt++;
                    }
                    strt++;
                    end++;
                }
            }
            int l = end - strt + 1;
            ans = ans > l ? ans : l;
        }
        return ans;
    }
}