class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        while(j<popped.length)
        {
            if(!st.isEmpty() && st.peek() == popped[j])
            {
                st.pop();
                j++;
            }
            else if(i >= pushed.length) 
            {
                return false;
            }
            else 
            {
                st.push(pushed[i++]);
            }
        }
        return true;
    }
}