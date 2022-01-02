class Solution {
    public boolean checkArithmetic(int[] arr)
    {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i+1]-arr[i] != diff)
                return false;
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) 
    {
        List<Boolean> ans = new ArrayList<>();
        Solution ob = new Solution();
        for(int i = 0; i<l.length; i++)
        {
            int[] a = new int[r[i] - l[i] + 1];
            int k = 0;
            for(int j = l[i]; j<=r[i]; j++)
            {
                a[k++] = nums[j];
            }
            ans.add(ob.checkArithmetic(a));            
        }
        return ans;
    }
}