class Solution {
    public String reverseVowels(String s) 
    {
        int l = 0;
        int r = s.length()-1;
        String vow = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        while(l<r)
        {
            if(vow.indexOf(ch[l]) == -1)
            {
                l++;
                continue;
            }
            if(vow.indexOf(ch[r]) == -1)
            {
                r--;
                continue;
            }
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;
            l++;
            r--;
        }
        return String.valueOf(ch);
    }
}