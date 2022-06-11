class Solution 
{
    public boolean check(String a, String b, HashMap<String, Integer> map)
    {
        for(int i = 0; i<a.length() && i<b.length(); i++)
        {
            if(map.get(b.charAt(i)+"") == map.get(a.charAt(i)+""))
            {
                continue;
            }
            else if(map.get(a.charAt(i)+"") < map.get(b.charAt(i)+""))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(a.length() <= b.length())
            return true;
        return false;
    }
    public boolean isAlienSorted(String[] words, String order) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<order.length(); i++)
        {
            map.put(order.charAt(i) + "", i);
        }
        for(int i = 1; i<words.length; i++)
        {
            if(!check(words[i-1], words[i], map))
            {
                return false;
            }
        }
        return true;
    }
}