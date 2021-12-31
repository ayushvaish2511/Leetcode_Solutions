class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int highest = 0;
        for(int i = 0; i<rectangles.length; i++)
        {
            int l = rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1];
            if(map.containsKey(l))
            {
                map.put(l, map.get(l)+1);
            }
            else 
            {
                map.put(l, 1);
            }
            if(l > highest)
                highest = l;
        }
        return map.get(highest);
    }
}