class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            //  Check if Right half is sorted or not 
            if(nums[mid] <= nums[high])
            {
                // Check if target is present in Right half or not
                if(nums[mid] <= target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else 
                {   
                    high = mid - 1;
                }
            }
            else 
            {
                // Check if target is present in left half or not
                if(nums[low] <= target && target <= nums[mid])
                {
                    high = mid - 1;
                }
                else 
                {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}