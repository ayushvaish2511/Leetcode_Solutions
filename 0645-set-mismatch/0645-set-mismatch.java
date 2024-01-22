class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        for(int i = 0; i<nums.length; i++)
        {
            if(hs.contains(nums[i]))
            {
                ans[0] = nums[i];
            }
            hs.add(nums[i]);
        }
        for(int i = 1; i<=nums.length; i++)
        {
            if(!hs.contains(i))
            {
                ans[1] = i;
                break;
            }
        }
        return ans;   
    }
}