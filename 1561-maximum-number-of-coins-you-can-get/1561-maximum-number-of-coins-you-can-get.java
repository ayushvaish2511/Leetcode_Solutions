class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int strt = 0;
        for(int i = piles.length-2; i>=strt; i-=2, strt++)
        {
            sum += piles[i];
        }
        return sum;
    }
}