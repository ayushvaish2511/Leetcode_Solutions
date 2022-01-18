class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[low])
            {
                low = low+1;
                high = mid;
            }
            else if(nums[mid] > nums[high])
            {
                low = mid+1;
            }
            else
            {
                high--;
            }
        }
        return nums[low];
    }
}