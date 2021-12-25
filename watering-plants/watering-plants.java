class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int water = capacity;
        for(int i = 0; i<plants.length; i++)
        {
            
            if(plants[i]<=water)
            {
                water = water - plants[i];
                steps++;
            }
            else 
            {
                steps = steps + i + i + 1;
                water = capacity;
                water = water - plants[i];
            }
        }
        return steps;
    }
}