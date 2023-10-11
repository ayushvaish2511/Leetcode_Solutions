class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        String valid = "()[]{}";
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else 
            {
                if(st.empty())
                    return false;
                int j = valid.indexOf(ch);
                int k = valid.indexOf(st.peek());
                if((j-k) != 1)
                {
                    return false;
                }
                else 
                {
                    st.pop();
                }
            }
        }
        return st.empty();
    }
}