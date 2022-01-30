class Solution {
    public String mergeAlternately(String a, String b) 
    {
        StringBuilder ans = new StringBuilder("");
        int i = 0;
        for(i = 0; i<a.length() && i<b.length(); i++)
        {
            ans.append(a.charAt(i));
            ans.append(b.charAt(i));
        }
        if(i<a.length())
        {
            ans.append(a.substring(i));
        }
        else 
        {
            ans.append(b.substring(i));
        }
        return ans.toString();
    }
}