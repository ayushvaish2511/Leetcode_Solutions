class Solution {
    public int search(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length-1;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                low = i+1;
                high = i;
            }
        }
        if(low<=high)
        {
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    high = mid - 1;
                else 
                    low = mid + 1;
            }
        }
        else if(target >= nums[low] && target<=nums[nums.length-1])
        {
            int l = low;
            int h = nums.length-1;
            while(l<=h)
            {
                int mid = (l+h)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    h = mid - 1;
                else 
                    l = mid + 1;
            }
        }
        else 
        {
            int l = 0;
            int h = high;
            while(l<=h)
            {
                int mid = (l+h)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    h = mid - 1;
                else 
                    l = mid + 1;
            }
        }
        return -1;
    }
}