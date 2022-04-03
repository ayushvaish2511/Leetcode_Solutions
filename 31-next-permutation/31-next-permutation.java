class Solution {
    public void nextPermutation(int[] nums) 
    {
        int index = -1;
        for(int i = nums.length-1; i>0; i--)
        {
            if(nums[i]>nums[i-1])
            {
                index = i-1;
                break;
            }
        }
        if(index == -1)
        {
            rev(nums, 0, nums.length-1);
            return;
        }
        int j = nums.length-1;
        for(int i = nums.length-1; i>=0; i--)
        {
            if(nums[i]>nums[index])
            {
                j = i;
                break;
            }
        }
        int temp = nums[index];
        nums[index] = nums[j];
        nums[j] = temp;
        
        rev(nums, index+1, nums.length-1);
    }
    public void rev(int[] nums, int i, int j)
    {
        while(i<=j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}