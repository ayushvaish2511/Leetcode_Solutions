class Solution {
    public int trap(int[] height) 
    {
        int n = height.length;
        int[] postfix = new int[n];
        int max = 0;
        for(int i = n-1; i>=0; i--)
        {
            max = max > height[i] ? max : height[i];
            postfix[i] = max;
        }
        int ans = 0;
        max = 0;
        for(int i = 0; i<height.length-1; i++)
        {
            max = max > height[i] ? max : height[i];
            int left = max;
            int right = postfix[i];
            ans += Math.min(left, right) - height[i];
        }
        return ans;
    }
}