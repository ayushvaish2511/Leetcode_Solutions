class Solution {
    public int maximumUniqueSubarray(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            sum[i] = sum[i-1] + nums[i];
        }
        int strt = 0;
        int end = 0;
        while(strt<=end && end<nums.length)
        {
            if(map.containsKey(nums[end]))
            {
                int s = sum[end-1];
                if(strt!=0)
                {
                    s -= sum[strt-1];
                }
                if(s > max)
                {
                    max = s;
                }
                if(map.get(nums[end])+1 > strt)
                    strt = map.get(nums[end]) + 1;
                map.put(nums[end], end);
            }
            else
            {
                map.put(nums[end], end);
            }
            end++;
        }
        if(strt == 0)
        {
            if(sum[end-1] > max)
            {
                max = sum[end-1];
            }
        }
        else if(sum[end-1] - sum[strt-1] > max)
        {
            max = sum[end-1] - sum[strt-1];
        }
            
        return max;
    }
}