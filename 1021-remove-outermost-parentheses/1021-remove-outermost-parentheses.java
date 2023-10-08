class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(ch);
                if(st.size() > 1)
                {
                    ans.append(ch);
                }
            }
            else 
            {
                if(st.size() > 1)
                {
                    ans.append(ch);
                }
                st.pop();
            }
        }
        return ans.toString();
    }
}