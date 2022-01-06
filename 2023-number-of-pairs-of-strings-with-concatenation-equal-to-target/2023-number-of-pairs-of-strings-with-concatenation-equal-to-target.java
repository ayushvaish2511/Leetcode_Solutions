class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String, Integer> freq = new HashMap<>();
        int c = 0;
        for(String str : nums)
        {
            if(target.startsWith(str))
            {
                String sub = target.substring(str.length());
                if(freq.containsKey(sub))
                {
                    c += freq.get(sub);
                }
            }
            if(target.endsWith(str))
            {
                String sub = target.substring(0, target.length()-str.length());
                if(freq.containsKey(sub))
                {
                    c += freq.get(sub);
                }
            }
            if(freq.containsKey(str))
                freq.put(str, freq.get(str) + 1);
            else 
                freq.put(str, 1);
        }
        return c;
        // int c = 0;
        // for(int i = 0; i<nums.length; i++)
        // {
        //     for(int j = 0; j<nums.length; j++)
        //     {
        //         if((nums[i] + nums[j]).equals(target) && i!=j)
        //             c++;
        //     }
        // }
        // return c;
    }
}