class Solution {
    public int minDeletions(String s) 
    {
        int[][] count = new int[26][2];
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            count[(int)ch%97][1]++;
            count[(int)ch%97][0] = (int)ch%97;
        }
        Arrays.sort(count, (a, b) -> Integer.compare(a[1], b[1]));
        HashSet<Integer> st = new HashSet<>();
        int ans = 0;
        for(int i = 0; i<26; i++)
        {
            if(count[i][1] != 0)
            {
                if(st.contains(count[i][1]))
                {
                    while(st.contains(count[i][1]) && count[i][1] > 0)
                    {
                        count[i][1]--;
                        ans++;
                    }
                    if(count[i][1]!=0)
                    {
                        st.add(count[i][1]);
                    }
                }
                else
                {
                    st.add(count[i][1]);
                }
            }
        }
        return ans;
    }
}