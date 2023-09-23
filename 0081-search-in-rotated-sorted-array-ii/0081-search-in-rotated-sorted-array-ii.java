class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
            {
                return true;
            }
            if(nums[mid] == nums[low] && nums[mid] == nums[high])
            {
                low++;
                high--;
                continue;
            }
            // Check if Left array is sorted or not
            if(nums[low] <= nums[mid])
            {
                // Check is target is there or not
                if(nums[low] <= target && target <= nums[mid])
                {
                    high = mid - 1;
                }
                else 
                {
                    low = mid + 1;
                }
            }
            else 
            {
                if(nums[mid] <= target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else 
                {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}