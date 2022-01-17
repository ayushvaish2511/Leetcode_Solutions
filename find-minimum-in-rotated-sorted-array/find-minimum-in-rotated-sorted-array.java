class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left] <= nums[right])
            return nums[left];
        if(nums.length == 2)
        {
            return Math.min(nums[0], nums[1]);
        }
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid] > nums[mid+1])
                return nums[mid+1];
            if(nums[left] > nums[left+1])
                return nums[left+1];
            else 
                left++;
            if(nums[right] < nums[right-1])
                return nums[right];
            else 
                right--;
        }
        return nums[left];
    }
}