class Solution {
    public int[] decrypt(int[] code, int k) 
    {
        int n = code.length;
        int[] ans = new int[n];
        if(k == 0)
        {
            return ans;
        }
        for(int i = 0; i<n; i++)
        {
            if(k > 0)
            {
                int c = 1;
                int j = (i+1)%n;
                int sum = 0;
                while(c<=k)
                {
                    sum += code[j];
                    j = (j+1)%n;
                    c++;
                }
                ans[i] = sum;
            }
            if(k < 0)
            {
                int c = 1;
                int j = i-1;
                if(j < 0)
                {
                    j = n-1;
                }
                int sum = 0;
                while(c<=Math.abs(k))
                {
                    sum += code[j];
                    j--;
                    if(j<0)
                    {
                        j = n-1;
                    }
                    c++;
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}