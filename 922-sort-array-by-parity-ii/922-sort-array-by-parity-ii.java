class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while(i<n && j<n)
        {
            if(nums[i]%2==0)
                i+=2;
            else
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(nums[j]%2==1)
                j+=2;
            else
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }            
        }
        return nums;
    }
}