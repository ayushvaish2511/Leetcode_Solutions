class Solution {
    public int numberOfBeams(String[] bank) 
    {
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i = 0; i<bank.length; i++)
        {
            int c = 0;
            for(int j = 0; j<bank[i].length(); j++)
            {
                if(bank[i].charAt(j) == '1')
                    c++;
            }
            if(c!=0)
                c1.add(c);
        }
        if(c1.size()<=1)
            return 0;
        int lasers = 0;
        for(int i = 0; i<c1.size()-1; i++)
        {
            lasers += (c1.get(i) * c1.get(i+1));
        }
        return lasers;
    }
}