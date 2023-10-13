class Solution {
    public int maxL(int[] arr, int i)
    {
        int ans = arr[i];
        for( ; i>=0; i--)
        {
            ans = ans > arr[i] ? ans : arr[i];
        }
        return ans;
    }
    public int maxR(int[] arr, int i)
    {
        int ans = arr[i];
        for( ; i<arr.length; i++)
        {
            ans = ans > arr[i] ? ans : arr[i];
        }
        return ans;
    }
    public int trap(int[] height) 
    {
        int ans = 0;
        for(int i = 1; i<height.length-1; i++)
        {
            int left = maxL(height, i);
            int right = maxR(height, i);
            ans += Math.min(left, right) - height[i];
        }
        return ans;
    }
}