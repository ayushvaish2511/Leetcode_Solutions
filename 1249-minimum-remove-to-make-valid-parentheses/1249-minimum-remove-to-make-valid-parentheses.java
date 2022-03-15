class Solution {
    public String minRemoveToMakeValid(String s) 
    {
        int[] stack = new int[s.length()+1];
        int top = -1;
        char[] ans = new char[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch != '(' && ch != ')')
                ans[i] = ch;
            else if(ch == '(')
            {
                top++;
                stack[top] = i;
                ans[i] = ch;
            }
            else 
            {
                if(top == -1)
                    continue;
                top--;
                ans[i] = ch;
            }
        }
        for(int i = 0; i<=top; i++)
        {
            ans[stack[i]] = '_';
        }
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i<ans.length; i++)
        {
            if(ans[i] == '(' || ans[i] == ')' || (ans[i]>='a' && ans[i]<='z'))
                str.append(ans[i]+"");
        }
        return str.toString();
        
    }
}