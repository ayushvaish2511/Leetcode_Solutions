class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] ans = {-1, -1};
        //Searching the starting index
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid] > target)
                right = mid-1;
            else if(nums[mid] < target)
                left = mid+1;
            else 
            {
                ans[0] = mid;
                right = mid-1;
            }
        }
        //Searching the last index
        left = 0;
        right = nums.length-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid] > target)
                right = mid-1;
            else if(nums[mid] < target)
                left = mid+1;
            else 
            {
                ans[1] = mid;
                left = mid+1;
            }
        }            
        return ans;
    }
}