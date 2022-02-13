class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> fi = new ArrayList<>();
        ans.add(fi);
        for(int n : nums)
        {
            int size = ans.size();
            for(int i = 0; i<size; i++)
            {
                List<Integer> te = new ArrayList<>(ans.get(i));
                te.add(n);
                ans.add(te);
            }
        }
        return ans;
    }
}