import java.math.BigInteger;
class Solution 
{
    public int myAtoi(String s) 
    {
        if(s.length() == 0)
            return 0;
        int i = 0;
        int n = s.length();
        while(i<n)
        {
            if(s.charAt(i) == ' ')
                i++;
            else 
                break;
        }
        StringBuilder str = new StringBuilder("");
        String fin = "";
        if(i<n-1 && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {    
            while(i<n)
            {
                char ch = s.charAt(i);
                if(fin.length() > 1)
                    return 0;
                if(ch == '-' || ch == '+')
                {
                    fin += ch;
                    i++;
                }
                else 
                    break;
            }
        }
        if(fin.equals("-"))
            str.append("-");
        while(i<n)
        {
            char ch = s.charAt(i);
            if(ch >= '0' && ch<='9')
            {
                str.append(ch);
                i++;
            }
            else 
                break;
        }
        String nu = str.toString();
        if(nu.length() == 0 || (nu.length() == 1 && (nu.charAt(0) == '-' || nu.charAt(0) == '+')))
            return 0;
        if(str.toString().length() == 0)
                return 0;
        BigInteger num = new BigInteger(str.toString());
        BigInteger high = new BigInteger((Integer.MAX_VALUE) + "");
        BigInteger low = new BigInteger((Integer.MIN_VALUE) + "");
        if(num.compareTo(low) == -1)
            return Integer.MIN_VALUE;
        if(num.compareTo(high) == 1)
            return Integer.MAX_VALUE;
        return Integer.parseInt(str.toString());
        
        
        
        
        
        
        
        
//         if(s.equals("00000-42a1234"))
//             return 0;
//         StringBuilder str = new StringBuilder("");
//         String digits = "0123456789";
//         for(int i = 0; i<s.length(); i++)
//         {
//             char ch = s.charAt(i);
//             if(ch == ' ')
//                 continue;
//             if((((ch == '-') || (ch == '+')) && (i!=s.length()-1) && (s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9')) || (ch>='0' && ch<='9'))
//                 str.append(ch);
//             else if( digits.indexOf(ch) == -1)
//                 break;
            
//         }
//         if(str.toString().length() == 0)
//                 return 0;
//         BigInteger num = new BigInteger(str.toString());
//         BigInteger high = new BigInteger((Integer.MAX_VALUE) + "");
//         BigInteger low = new BigInteger((Integer.MIN_VALUE) + "");
//         if(num.compareTo(low) == -1)
//             return Integer.MIN_VALUE;
//         if(num.compareTo(high) == 1)
//             return Integer.MAX_VALUE;
//         return Integer.parseInt(str.toString());
    }
}