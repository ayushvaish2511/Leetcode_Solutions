class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        int toRem = -1;
        int c = 0;
        for(int i = 1; i<n; i++)
        {
            if(nums[i-1] >= nums[i])
            {
                c++;
                toRem = i;
            }
        }
        if(c > 1)
            return false;
        else if(c == 0)
            return true;
        else if(toRem == 1 || toRem == n-1)
            return true;
        else if(nums[toRem - 1] < nums[toRem + 1])   // remove toRem
            return true;
        else if( (toRem-2 >= 0) && (nums[toRem - 2] < nums[toRem]))      //remove toRem-1
            return true;
        else if(toRem < 0)
            return true;
        else
            return false;
    }
}