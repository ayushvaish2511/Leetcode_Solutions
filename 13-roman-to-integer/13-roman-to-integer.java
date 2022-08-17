class Solution {
    public int romanToInt(String s) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int ans = 0;
        int prev = 0;
        for(int i = s.length()-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            if(i == (s.length() - 1))
            {
                ans += map.get(ch+"");
                prev = map.get(ch+"");
            }
            else
            {
                int temp = map.get(ch+"");
                if(temp < prev)
                    ans -= temp;
                else 
                    ans += temp;
                prev = temp;
            }
        }
        return ans;
    }
}