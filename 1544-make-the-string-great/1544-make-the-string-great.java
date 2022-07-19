class Solution {
    public String makeGood(String s) 
    {
        int l = s.length(); 
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else
            {
                char ch1 = st.peek().charValue();
                if(Math.abs((int)ch1 - (int)ch) == 32)
                {
                    st.pop();
                }
                else
                {
                    st.push(ch);
                }
            }
        }
        StringBuilder ans = new StringBuilder("");
        while(!st.isEmpty())
        {
            ans.insert(0, st.peek().charValue());
            st.pop();
        }
        return ans.toString();
    }
}