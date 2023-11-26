class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int strt = 0, end = 0, count = 0, ans = 0, odd = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]%2 == 1)
            {
                odd++;
                if(odd >= k)
                {
                    count = 1;
                    while(!(nums[strt++] % 2 == 1))
                    {
                        count++;
                    }
                    ans += count;
                }
            }
            else if(odd >= k)
            {
                ans += count;
            }
        }
        return ans;
    }
}