class Solution {
    
    public void reverse(int[] arr, int strt, int end)
    {
        while(strt<end)
        {
            int temp = arr[strt];
            arr[strt] = arr[end];
            arr[end] = temp;
            strt++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k%n;                //If k is greater than the size of the array
        k = n-k;                // For rigth rotations n-k left rotations are required 
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }
    
}