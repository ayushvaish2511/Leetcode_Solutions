class Solution {
    public String restoreString(String s, int[] indices) 
    {
        int n = indices.length;
        char[] ret = new char[n];
        for(int i = 0; i<n; i++)
        {
            ret[indices[i]] = s.charAt(i);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<n; i++)
        {
            ans.append(ret[i]+"");
        }
        return ans.toString();
    }
}