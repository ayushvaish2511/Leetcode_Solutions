class Solution {
    public int minLength(String[] words)
    {
        int min = words[0].length();
        for(String i : words)
        {
            int l = i.length();
            min = min < l ? min : l;
        }
        return min;
    }
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder ans = new StringBuilder("");
        int min = minLength(strs);
        for(int i = 0; i<min; i++)
        {
            char ch = strs[0].charAt(i);
            for(String s : strs)
            {
                char ch1 = s.charAt(i);
                if(ch != ch1)
                {
                    return ans.toString();
                }
            }
            ans.append(ch+"");
        }
        return ans.toString();
    }
}