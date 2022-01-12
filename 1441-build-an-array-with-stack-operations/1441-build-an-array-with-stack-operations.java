class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        ArrayList<String> ans = new ArrayList<String>();
        int i = 0;
        int c = 1;
        while(c<=n && i<target.length) 
        {
            if(target[i] == c)
            {
                ans.add("Push");
                i++;
            }
            else 
            {
                ans.add("Push");
                ans.add("Pop");
            }
            c++;
        }    
        return ans;
    }
}