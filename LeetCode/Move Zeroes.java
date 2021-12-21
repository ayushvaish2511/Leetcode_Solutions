class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int curr = 0;
        for(int i = 0; i<n;i++)
        {
            if(nums[i] != 0)
            {
                nums[curr++] = nums[i];
            }
        }
        for(int i = curr; i<n; i++)
        {
            nums[i] = 0;
        }
    }
}