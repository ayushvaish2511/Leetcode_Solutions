class Solution {
    public boolean isOneBitCharacter(int[] bits) 
    {
        int c1 = 0;
        int c2 = 0;
        int n = bits.length;
        int i = 0;
        for(i = 0; i<n; i++)
        {
            if(bits[i] == 1)
                i++;
            else if(i == n-1)
                return true;
        }
        return false;
    }
}