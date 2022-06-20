class Solution {
    public int minimumLengthEncoding(String[] words) 
    {
        Set<String> st = new HashSet<>(Arrays.asList(words));    
        for(String w : words)
        {
            if(st.contains(w))
            {
                for(int i = 1; i<w.length(); i++)
                {
                    st.remove(w.substring(i));
                }
            }
        }
        int ans = st.size();
        for(String w : st)
        {
            ans += w.length();
        }
        return ans;
    }
}