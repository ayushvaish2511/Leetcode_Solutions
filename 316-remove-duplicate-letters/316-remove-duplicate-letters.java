class Solution {
    public String removeDuplicateLetters(String s) 
    {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            int index = ch-'a';
            freq[index]--;
            if(visited[index])
                continue;
            while(!st.isEmpty() && ch < st.peek() && freq[st.peek() - 'a']!=0)
            {
                char top = st.pop();
                visited[top-'a'] = false;
            }
            st.push(ch);
            visited[ch-'a'] = true;            
        }
        StringBuilder ans = new StringBuilder("");
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return ((ans.reverse()).toString());
    }
}