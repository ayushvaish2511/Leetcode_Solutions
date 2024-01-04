class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else 
            {
                map.put(i, 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> mp : map.entrySet())
        {
            int value = mp.getValue().intValue();
            if(value == 1)
            {
                return -1;
            }
            ans += (int)Math.ceil(value/3.0);
        }
        return ans;
    }
}