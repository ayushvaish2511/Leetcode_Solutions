class Solution {
    class Pairs
    {
        char letter;
        int c;
        Pairs(char letter, int c)
        {
            this.letter = letter;
            this.c = c;
        }
    }
    public String removeDuplicates(String s, int k) 
    {
        Stack<Pairs> st = new Stack<>();
        int l = s.length();
        for(int i = 0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(!st.isEmpty())
            {
                Pairs temp = st.peek();
                if(temp.letter == ch)
                {
                    int curr = temp.c + 1;
                    st.pop();
                    st.push(new Pairs(ch, curr));
                }
                else 
                {
                    st.push(new Pairs(ch, 1));
                }
            }
            else 
            {
                st.push(new Pairs(ch, 1));
            }
            if(st.peek().c == k)
            {
                st.pop();
            }
        }
        StringBuilder ans = new StringBuilder("");
        for(Pairs p : st)
        {
            int i = p.c;
            while(i!=0)
            {
                i--;
                ans.append(p.letter + "");
            }
        }
        return ans.toString();
    }
}