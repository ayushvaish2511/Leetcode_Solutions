class Solution {
    public int findPairs(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }
        int c = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(k==0)
            {
                if(entry.getValue() >= 2)
                    c++;
            }
            else
            {
                if(map.containsKey(entry.getKey() + k))
                    c++;
            }
        }
        return c;
    }
}