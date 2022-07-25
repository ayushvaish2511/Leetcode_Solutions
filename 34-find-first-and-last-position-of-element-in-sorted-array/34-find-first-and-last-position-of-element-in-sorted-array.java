class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int[] ans = {-1, -1};
        int i = 0;
        int j = n-1;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(nums[mid] == target)
            {
                ans[0] = mid;
            }
            if(nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        i = 0;
        j = n-1;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(nums[mid] == target)
            {
                ans[1] = mid;
            }
            if(nums[mid] <= target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return ans;
    }
}