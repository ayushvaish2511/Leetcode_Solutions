class Solution {
    public int countPoints(String rings) 
    {
        String[] rods = new String[10];
        for(int i = 0; i<10; i++)
            rods[i] = "";
        for(int i = 0; i<rings.length(); i+=2)
        {
            char color = rings.charAt(i);
            int pos = (int)(rings.charAt(i+1) - '0');
            rods[pos] += color;
        }
        int c = 0;
        for(int i = 0; i<10; i++)
        {
            if((rods[i].indexOf('R') != -1) && (rods[i].indexOf('G') != -1) && (rods[i].indexOf('B') != -1))
                c++;
        }
        return c;
    }
}