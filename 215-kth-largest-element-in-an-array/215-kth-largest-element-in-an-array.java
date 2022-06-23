class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        int n = nums.length;
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int f = 0;
        for(Map.Entry it : mp.entrySet())
        {
            f += (int)it.getValue();
            if(f >= (n-k+1))
            {
                return (int)it.getKey();
            }
        }
        return -1;
    }
}