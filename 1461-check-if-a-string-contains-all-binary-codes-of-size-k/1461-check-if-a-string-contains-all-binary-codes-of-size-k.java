class Solution {
    public boolean hasAllCodes(String s, int k) 
    {
        HashSet<String> st = new HashSet<String>();
        for(int i = 0; i<s.length()-k+1; i++)
        {
            String sub = s.substring(i, i+k);
            st.add(sub);
            if(st.size() == Math.pow(2, k))
                return true;
        }
        return false;
    }
}