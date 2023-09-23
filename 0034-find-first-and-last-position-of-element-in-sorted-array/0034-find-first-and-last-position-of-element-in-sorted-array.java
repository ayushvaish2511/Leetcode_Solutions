class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        ans[0] = -1;
        ans[1] = -1;        
        int low = 0, high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] >= target)
            {
                ans[0] = mid;
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        if(ans[0] == -1)
        {
            return ans;
        }
        if(nums[ans[0]] != target)
        {
            ans[0] = -1;
            return ans;
        }
        low = 0;
        high = n-1;
        ans[1] = n;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] > target)
            {
                ans[1] = mid;
                high = mid-1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        if(ans[1] == n)
        {
            ans[1] = n-1;
        }
        else 
        {
            ans[1]--;
        }
        return ans;
    }
}