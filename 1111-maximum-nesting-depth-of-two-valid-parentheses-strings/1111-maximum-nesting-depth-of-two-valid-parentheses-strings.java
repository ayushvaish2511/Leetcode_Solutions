class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int c = 0;
        int[] ans = new int[seq.length()];
        for(int i = 0; i<seq.length(); i++)
        {
            char ch = seq.charAt(i);
            if(ch=='(')
            {
                ans[i] = c%2;
                c++;
            }
            else 
            {
                c--;
                ans[i] = c%2;
            }
        }
        return ans;
    }
}