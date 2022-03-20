class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) 
    {
        int[] ca = new int[7];
        int[] cb = new int[7];
        int[] overlap = new int[7];
        for(int i = 0; i<tops.length; i++)
        {
            ca[tops[i]]++;
            cb[bottoms[i]]++;
            if(tops[i] == bottoms[i])
            {
                overlap[tops[i]]++;
            }
        }
        for(int i = 1; i<=6; i++)
        {
            if(ca[i] + cb[i] - overlap[i] == tops.length)
                return tops.length - Math.max(ca[i], cb[i]);
        }
        return -1;
        
    }
}