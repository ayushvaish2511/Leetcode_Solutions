class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        int c = 0;
        for(int i = 0; i<nums.length; i++)
        {
            c += nums[i]==1 ? 1 : -1;
            if(map.containsKey(c))
                max = Math.max(max, i-map.get(c));
            else 
                map.put(c, i);
        }
        return max;
    }
}