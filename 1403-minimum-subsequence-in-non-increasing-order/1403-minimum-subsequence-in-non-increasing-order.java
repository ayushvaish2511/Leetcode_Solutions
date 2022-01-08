class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++)
        {
            nums[i] = nums[i] + nums[i-1];
        }
        
        int sum = 0;
        for(int i = nums.length-1; i>=0; i--)
        {
            if(i>0)
            {
                sum = sum + nums[i] - nums[i-1];
                if(sum>nums[i-1])
                {
                    ans.add(nums[i]-nums[i-1]);
                    break;
                }
                else 
                {
                    ans.add(nums[i]-nums[i-1]);
                }
            }
            else 
            {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}