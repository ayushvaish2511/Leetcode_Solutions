class Solution {
    public int scoreOfParentheses(String s) 
    {
        Stack<Integer> st = new Stack<>();
        if(s.length() == 0)
            return 0;
        st.push(0);
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(0);
            else 
            {
                int a = st.pop();
                int b = st.pop();
                st.push(Math.max(2*a, 1) + b);
            }
        }
        return st.pop();
    }
}