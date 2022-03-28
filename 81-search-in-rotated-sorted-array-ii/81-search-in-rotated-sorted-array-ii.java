class Solution {
    public boolean search(int[] nums, int target) 
    {
        int pivot = findPivot(nums);
        if(pivot == -1)
            return binary(nums, 0, nums.length-1, target);
        if(nums[pivot] == target)
            return true;
        if(target >= nums[0])
            return binary(nums, 0, pivot-1, target);
        
        return binary(nums, pivot+1, nums.length-1, target);
    }
    public int findPivot(int[] nums)
    {
        int strt = 0;
        int end = nums.length-1;
        while(strt <= end)
        {
            int mid = strt + (end - strt)/2;
            if(mid < end && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(mid>strt && nums[mid] < nums[mid-1])
            {
                return mid-1;
            }
            if(nums[mid] == nums[strt] && nums[mid] == nums[end])
            {
                if(strt < end && nums[strt] > nums[strt + 1])
                    return strt;
                strt++;
                if(end > strt && nums[end] < nums[end - 1])
                    return end-1;
                end--;
            }
            else if(nums[strt] < nums[mid] || (nums[strt] == nums[mid] && nums[mid] > nums[end]))
            {
                strt = mid+1;
            }
            else 
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public boolean binary(int[] nums, int strt, int end, int target)
    {
        while(strt<=end)
        {
            int mid = strt + (end-strt)/2;
            if(nums[mid] == target)
                return true;
            if(target < nums[mid])
                end = mid - 1;
            else 
                strt = mid + 1;
        }
        return false; 
    }
}