class Solution {
    public int partitionString(String s) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(set.contains(ch+""))
            {
                ans++;
                set.clear();
                set.add(ch+"");
            }
            else 
            {
                set.add(ch+"");
            }
        }
        if(set.size()>0)
            ans++;
        return ans;
    }
}