class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(st.isEmpty())
                st.push(ch);
            else 
            {
                if(ch == '(' || ch == '{' || ch == '[')
                    st.push(ch);
                else
                {
                    char last = st.peek();
                    if(last == '(' && ch == ')')
                        st.pop();
                    else if(last == '{' && ch == '}')
                        st.pop();
                    else if(last == '[' && ch == ']')
                        st.pop();
                    else 
                        return false;
                }
            }
            i++;
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}