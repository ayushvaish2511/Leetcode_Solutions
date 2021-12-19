class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int n = index.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i<n; i++)
        {
            ans.add(index[i], nums[i]);
        }
        int[] ret = new int[n];
        for(int i = 0; i<n; i++)
        {
            ret[i] = ans.get(i);
        }
        return ret;
    }
}