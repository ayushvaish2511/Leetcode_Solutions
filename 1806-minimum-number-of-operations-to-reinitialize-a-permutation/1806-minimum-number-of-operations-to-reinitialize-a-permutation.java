class Solution {
    public int reinitializePermutation(int n) 
    {
        int c = 0;
        int i = 1;
        while(c==0 || i>1)
        {
            if(i%2==0)
                i = i/2;
            else 
                i = n/2 + (i-1)/2;
            c++;
        }
        return c;
    }
}