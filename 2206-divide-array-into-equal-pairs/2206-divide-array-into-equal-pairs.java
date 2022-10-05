class Solution {
    public boolean divideArray(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else 
            {
                map.put(nums[i], 1);
            }
        }
        int c = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            int value = m.getValue().intValue();
            if(value % 2 != 0)
                return false;
            c += value/2;
        }
        if(c > nums.length/2)
            return false;
        return true;
    }
}