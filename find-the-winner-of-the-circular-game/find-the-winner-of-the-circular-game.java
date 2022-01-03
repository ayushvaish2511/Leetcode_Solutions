class Solution {
    public int findTheWinner(int n, int k) 
    {
        ArrayList<String> seat = new ArrayList<>();
        for(int i = 1; i<=n; i++)
        {
            seat.add(i+"");
        }
        int prev = 0;
        while(seat.size()>1)
        {
            prev = ((prev+k-1)%seat.size());
            seat.remove(prev);
        }
        return Integer.parseInt(seat.get(0));
    }
}