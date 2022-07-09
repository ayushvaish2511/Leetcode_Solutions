class Solution {
    public int maxResult(int[] nums, int k) 
    {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.offer(0);
        for(int i = 1; i<nums.length; i++)
        {
            while(dq.peekFirst() !=null && dq.peekFirst()<i-k) 
            {
                dq.pollFirst();
            }
            dp[i] = dp[dq.peekFirst()] + nums[i];
            while(dq.peekLast()!=null && dp[i]>=dp[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return dp[n-1];
        // int n = nums.length;
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // for(int i = 1; i<n; i++)
        // {
        //     int j = Math.max(0, i-k);
        //     int maxdp = dp[j] + nums[i];
        //     for(j++; j<i; j++)
        //     {
        //         maxdp = Math.max(maxdp, dp[j] + nums[i]);
        //     }
        //     dp[i] = maxdp;
        // }
        // return dp[n-1];
//         int n = nums.length;
//         if(nums.length == 1)
//             return nums[0];
//         int sum = nums[0];
//         int i = 0;
//         while(i<n)
//         {
//             if(i >= n-1)
//             {
//                 // sum += nums[n-1];
//                 break;
//             }
//             int max = nums[i+1];
//             int maxj = i+1;
//             for(int j = i+2; j<=i+k && j<n; j++)
//             {
//                 if(nums[j] > max)
//                 {
//                     maxj = j;
//                     max = nums[j];
//                 }
//                 else if(nums[j] > 0)
//                 {
//                     sum += nums[j];
//                     maxj = j;
//                 }
//             }
//             sum += max;
//             i = maxj;
            
//         }
//         return sum;
    }
}