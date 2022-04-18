class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) 
    {
        HashSet<Integer> check = new HashSet<>();
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0, j = 0;
        if(x == 1 && y==1)
        {
            if(bound>=2)
                ans.add(2);
            return ans;
        }
        if(y < x)
        {
            int temp = x;
            x = y;
            y = temp;
        }
        
        if(x == 1)
        {
            while(Math.pow(y, j) <= bound)
            {
                int sum = 1 + (int)Math.pow(y, j);
                if(sum <= bound)
                {
                   if(!check.contains(sum))
                    {
                    ans.add(sum);
                    check.add(sum);
                    }
                    j++; 
                }
            }
            return ans;
        }
        while(true)
        {
            int sum = (int)(Math.pow(x, i) + Math.pow(y, j));
            if(sum <= bound)
            {
                if(!check.contains(sum))
                {
                    ans.add(sum);
                    check.add(sum);
                }
                j++;
            }
            else
            {
                i++;
                j = 0;
                if(Math.pow(x, i) > bound)
                    break;
            }
        }
        return ans;
    }
}