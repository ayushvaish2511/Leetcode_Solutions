class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solver(ans, nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return ans;
    }
    public void solver(List<List<Integer>> ans, int[] nums, List<Integer> inner, boolean[] visit)
    {
        if(inner.size() == nums.length)
        {
            ans.add(new ArrayList<>(inner));
            return;
        }
        for(int i = 0; i<visit.length; i++)
        {
            if(visit[i])
                continue;
            if(i!=0 && nums[i] == nums[i-1] && !visit[i-1])
                continue;
            visit[i] = true;
            inner.add(nums[i]);
            solver(ans, nums, inner, visit);
            visit[i] = false;
            inner.remove(inner.size()-1);
        }
    }
}