class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums.length; i++)
        {
            int ele = Math.abs(nums[i]);
            if(nums[ele-1] < 0)
            {
                ans.add(ele);
            }
            else
            {
                nums[ele-1] = 0-nums[ele-1];
            }
        }
        return ans;
    }
}