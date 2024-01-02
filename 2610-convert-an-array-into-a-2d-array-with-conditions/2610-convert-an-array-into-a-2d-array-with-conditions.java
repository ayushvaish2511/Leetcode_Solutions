class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[201];
        for(int i : nums)
        {
            if(ans.size() == 0 || freq[i] >= ans.size())
            {
                ans.add(new ArrayList<Integer>());
            }
            ans.get(freq[i]).add(i);
            freq[i]++;
        }
        return ans;
    }
}