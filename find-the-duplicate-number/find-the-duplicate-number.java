class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int c = 0;
            for(int n : nums)
            {
                if(n <= mid)
                    c++;
            }
            if(c > mid)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
}