class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        // int n = nums.length/2;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<2*n; i++)
        // {
        //     if(map.containsKey(nums[i]))
        //     {
        //         map.put(nums[i], map.get(nums[i])+1);
        //         if(map.get(nums[i]) == n)
        //             return nums[i];
        //     }
        //     else
        //     {
        //         map.put(nums[i], 1);
        //     }
        // }
        // return 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return 0;
    }
}
