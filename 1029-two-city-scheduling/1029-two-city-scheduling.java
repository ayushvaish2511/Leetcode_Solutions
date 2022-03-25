class Solution {
    public int twoCitySchedCost(int[][] costs) 
    {
        int costA = 0;
        for(int i = 0; i<costs.length; i++)
        {
            costA += costs[i][0];
        }
        int[] diff = new int[costs.length];
        for(int i = 0; i<costs.length; i++)
        {
            diff[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(diff);
        for(int i = 0; i<costs.length/2; i++)
        {
            costA += diff[i];
        }
        return costA;
    }
}