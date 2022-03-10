class Solution {
    public int findLHS(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else 
                map.put(nums[i], 1);
        }
        int ans = 0;
        for(Map.Entry ele : map.entrySet())
        {
            int key = (int)ele.getKey();
            int value = (int)ele.getValue();
            if(map.containsKey(key-1))
            {
                int c = value + map.get(key-1);
                if(c > ans)
                    ans = c;
            }
            if(map.containsKey(key+1))
            {
                int c = value + map.get(key+1);
                if(c > ans)
                    ans = c;
            }
        }
        return ans;
    }
}