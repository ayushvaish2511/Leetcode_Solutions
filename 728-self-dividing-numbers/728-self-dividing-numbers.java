class Solution {
    public boolean isDiv(int num)
    {
        int temp = num;
        while(temp!=0)
        {
            int d = temp%10;
            if(d == 0|| num%d !=0)
                return false;
            temp = temp/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i<=right; i++)
        {
            if(isDiv(i))
                ans.add(i);
        }
        return ans;
    }
}