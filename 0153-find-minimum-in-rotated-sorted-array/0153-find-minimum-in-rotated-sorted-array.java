class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] < ans)
            {
                ans = nums[mid];                
            }
            // If Right side is sorted then we habe to search in left side
            if(nums[mid] <= nums[high])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}