class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        int[] lastIndex = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            lastIndex[s.charAt(i)-'a'] = i;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int j = 0;
        int anc = 0;
        for(int i = 0; i<s.length(); i++)
        {
            j = Math.max(j, lastIndex[s.charAt(i)-'a']);
            if(i==j)
            {
                ans.add(i-anc+1);
                anc = i+1;
            }
        }
        return ans;
    }
}