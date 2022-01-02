class Solution {
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> re = new ArrayList<List<Integer>>(n);
        for(int i = 0; i<n; i++)
        {
            List<Integer> a = new ArrayList<Integer>();
            for(int j = 0; j<=i; j++)
            {
                if(i==j || j==0)
                {
                    a.add(1);
                }
                else 
                {
                    int ele = re.get(i-1).get(j-1) + re.get(i-1).get(j);
                    a.add(ele);
                }
            }
            re.add(a);
        }
        return re;
    }
}