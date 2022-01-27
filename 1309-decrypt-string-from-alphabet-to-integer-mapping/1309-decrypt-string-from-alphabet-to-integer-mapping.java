class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder("");
        for(int i = s.length()-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            if(ch=='#')
            {
                int n = Integer.parseInt(s.charAt(i-2) + "" + s.charAt(i-1)) - 1;
                char an = (char)(n + (int)'a');
                ans.append(an);
                i = i-2;
            }
            else 
            {
                int n = Integer.parseInt(ch+"") - 1;
                char an = (char)(n + (int)'a');
                ans.append(an);
            }
        }
        return (ans.reverse()).toString();
    }
}