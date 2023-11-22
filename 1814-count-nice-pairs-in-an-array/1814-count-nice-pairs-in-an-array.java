class Solution {
    public int rev(int n)
    {
        int r = 0;
        while(n!=0)
        {
            r = r * 10 + n%10;
            n /= 10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            int r = rev(nums[i]);
            int diff = nums[i] - r;
            if(map.containsKey(diff))
            {
                map.put(diff, map.get(diff) + 1);
            }
            else 
            {
                map.put(diff, 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer,Integer> mp : map.entrySet())
        {
            int val = mp.getValue();
            if(val > 1)
            {
                ans = (int)(((long)ans + ((((long)val) * (val-1))/2)) % 1000000007);
            }
        }
        return ans;
    }
}