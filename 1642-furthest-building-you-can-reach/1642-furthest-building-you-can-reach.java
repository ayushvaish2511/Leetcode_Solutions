class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) 
    {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<n-1; i++)
        {
            int diff = heights[i+1] - heights[i];
            if(diff > 0)
            {
                if(ladders > 0)
                {
                    ladders--;
                    pq.add(diff);
                }
                else if(pq.size() > 0 && diff > pq.peek())
                {
                    pq.add(diff);
                    bricks -= pq.poll();
                }
                else 
                {
                    bricks -= diff;
                }
                if(bricks < 0)
                    return i;
            }            
        }
        return n-1;
    }
}