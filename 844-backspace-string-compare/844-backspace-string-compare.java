class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> sa = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '#')
            {
                if(!sa.empty())
                {
                    sa.pop();   
                }                    
            }
            else 
            {
                sa.push(ch);
            }
        }
        StringBuilder sf = new StringBuilder("");
        while(!sa.empty())
        {
            sf.append(sa.pop());
        }
        sf.reverse();
        Stack<Character> sb = new Stack<>();
        for(int i = 0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(ch == '#')
            {
                if(!sb.empty())
                {
                    sb.pop();   
                }                    
            }
            else 
            {
                sb.push(ch);
            }
        }
        StringBuilder tf = new StringBuilder("");
        while(!sb.empty())
        {
            tf.append(sb.pop());
        }
        tf.reverse();
        if((sf.toString()).equals(tf.toString()))
            return true;
        return false;
    }
}