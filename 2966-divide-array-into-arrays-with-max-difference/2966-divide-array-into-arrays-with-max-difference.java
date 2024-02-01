class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        int ind = 0;
        for(int i = 0; i<n; i+=3)
        {
            int diff = nums[i+2] - nums[i];
            if(diff <= k)
            {
                ans[ind][0] = nums[i];
                ans[ind][1] = nums[i+1];
                ans[ind][2] = nums[i+2];
                ind++;
            }
            else 
            {
                return new int[0][0];
            }
        }
        return ans;
    }
}