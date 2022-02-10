class Solution {
    public int sum(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = lowLimit; i<=highLimit; i++)
        {
            int s = sum(i);
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else 
            {
                map.put(s, 1);
            }
            if(map.get(s) > max)
                max = map.get(s);
        }
        return max;
    }
}
