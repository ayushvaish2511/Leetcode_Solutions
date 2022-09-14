class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = 0;
        if(target < nums[0])
            return 0;
        if(target > nums[n-1])
            return n;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(target == nums[mid])
                return mid;
            if(nums[mid] > target)
            {
                right = mid-1;
            }
            else if(nums[mid] < target)
            {
                ans = mid;
                left = mid+1;
            }
                        
        }
        return ans+1;
    }
}