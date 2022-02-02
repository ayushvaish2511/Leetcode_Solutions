class Solution {
    public int sumBase(int n, int k) 
    {
        int sum = 0;
        int multi = 0;
        while(n!=0)
        {
            int d = n%k;
            sum = sum + d;
            n = n/k;
        }
        return sum;
    }
}