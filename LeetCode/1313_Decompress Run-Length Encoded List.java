class Solution {
    public int[] decompressRLElist(int[] nums) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int i = 0; i<n; i+=2)
        {
            for(int j = 1; j<=nums[i]; j++)
            {
                ans.add(nums[i+1]);
            }
        }
        int[] ret = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++)
        {
            ret[i] = ans.get(i);
        }
        return ret;
        
    }
}