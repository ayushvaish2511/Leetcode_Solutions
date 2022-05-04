class Solution {
    public int maxOperations(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int req = k-nums[i];
            if(map.containsKey(req) && map.get(req) > 0)
            {
                c++;
                map.put(req, map.get(req)-1);
            }
            else 
            {
                if(map.containsKey(nums[i]))
                {
                    map.put(nums[i], map.get(nums[i])+1);
                }
                else 
                {
                    map.put(nums[i], 1);
                }
            }
        }
        return c;
    }
}