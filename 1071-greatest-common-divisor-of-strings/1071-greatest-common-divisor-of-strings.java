class Solution {
    public String repeatWords(String a, int n)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<n; i++)
        {
            sb.append(a);
        }
        return sb.toString();
    }
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder("");
        int m = str1.length();
        int n = str2.length();
        if(m < n)
        {
            String temp = str1;
            str1 = str2;
            str2 = temp;
            int t = m;
            m = n;
            n = t;
        }
        String ans = "";
        int i = 0;
        while(i<n)
        {
            char ch = str2.charAt(i);
            sb.append(ch);
            int gcd = sb.length();
            if(m % gcd == 0 && n % gcd == 0)
            {
                String generate = repeatWords(sb.toString(), (m/gcd));
                String generate2 = repeatWords(sb.toString(), (n/gcd));
                if(generate.equals(str1) && generate2.equals(str2))
                {
                    ans = sb.toString();
                }
                
            }
            i++;
        }
        return ans;
    }
}