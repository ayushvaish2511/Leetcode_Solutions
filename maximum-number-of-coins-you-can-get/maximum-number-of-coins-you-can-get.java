import java.util.Arrays;
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int c = piles.length/3;
        int i = piles.length-2;
        int sum = 0;
        while(c>0)
        {
            sum = sum + piles[i];
            i = i-2;
            c--;
        }
        return sum;
    }
}