class Solution {
    public String replaceDigits(String s) 
    {
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i<s.length()-1; i+=2)
        {
            char ch = s.charAt(i);
            int skip = Integer.parseInt(s.charAt(i+1) +"");
            ans.append(ch+"");
            ch = (char)((int)ch + skip);
            ans.append(ch+"");
        }
        if(s.charAt(s.length()-1)>='a' && s.charAt(s.length()-1)<='z')
            ans.append(s.charAt(s.length()-1) + "");
        return ans.toString();
    }
}