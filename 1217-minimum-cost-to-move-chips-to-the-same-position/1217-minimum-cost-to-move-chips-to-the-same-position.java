class Solution {
    public int minCostToMoveChips(int[] position) 
    {
        int ce = 0, co = 0;
        for(int i = 0; i<position.length; i++)
        {
            if(position[i]%2 == 0)
                ce++;
            else 
                co++;
        }
        if(ce<co)
            return ce;
        return co;
    }
}