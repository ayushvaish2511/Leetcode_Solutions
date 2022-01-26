class Solution {
    public void reverseString(char[] s) 
    {
        //Iterative approach
        // int i = 0, j = s.length-1;
        // while(i<=j)
        // {
        //     char a = s[i];
        //     s[i] = s[j];
        //     s[j] = a;
        //     i++;
        //     j--;
        // }
        // System.out.println(s);
        Rev(0, s.length-1, s);
    }
    
    public static void Rev(int i, int j, char[] s)
    {
        if(s == null || i>=j)
            return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        Rev(i+1, j-1, s);
    }
}