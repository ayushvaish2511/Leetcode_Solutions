class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int ans = 1;
        int curr = nums.length-1;
        while(curr>=0)
        {
            int sum = 0;
            int c = 1;
            for(int i = curr-1; i>=0; i--)
            {
                int diff = nums[curr] - nums[i];
                if(sum + diff <= k)
                {
                    sum += diff;
                    c++;
                }
                else 
                {
                    break;
                }
            }
            ans = ans > c ? ans : c;
            curr--;
            while(curr >= 0)
            {
                if(nums[curr] != nums[curr+1])
                {
                    break;
                }
                else 
                {
                    curr--;
                }
            }
        }
        return ans;
    }
}