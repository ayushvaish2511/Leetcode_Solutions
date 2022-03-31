class Solution {
    public boolean check(int[] nums, int m, int mid)
    {
        int c = 1, sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
            if(sum > mid)
            {
                c++;
                sum = nums[i];
                if(c > m)
                    return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int m) 
    {
        int l = nums.length;
//         if(l%m == 0)
//         {
//             int divide_size = l/m;
//             int c = 0;
//             int sum = 0;
//             int maxsum = 0;
//             for(int i = 0; i<l; i++)
//             {
//                 if(c==divide_size)
//                 {
//                     if(sum > maxsum)
//                         maxsum = sum;
//                     sum = 0;
//                     c = 0;
//                 }
//                 sum += nums[i];
//                 c++;
                
//             }
//             return Math.max(maxsum, sum);
//         }
        // else 
        // {
            int low = 0, high = 0;
            for(int i = 0; i<l; i++)
            {
                low = Math.max(nums[i], low);
                high += nums[i];
            }
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                if(check(nums, m, mid))
                {
                    high = mid - 1;
                }
                else 
                {
                    low = mid + 1;
                }
            }
            return low;
        //}
    }
}