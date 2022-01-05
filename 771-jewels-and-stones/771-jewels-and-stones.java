class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        Set<Character> je = new HashSet<Character>();
        for(int i = 0; i<jewels.length(); i++)
        {
            if(!je.contains(jewels.charAt(i)))
                je.add(jewels.charAt(i));
        }
        int c = 0;
        for(int i = 0; i<stones.length(); i++)
        {
            if(je.contains(stones.charAt(i)))
                c++;
        }
        return c;
    }
}