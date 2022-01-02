class Solution {
    public int[] deckRevealedIncreasing(int[] deck) 
    {
        int n = deck.length;
        Queue<Integer> qu = new LinkedList<>();
        for(int i = 0; i<n; i++)
        {
            qu.add(i);
        }
        Arrays.sort(deck);
        int ans[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            ans[qu.poll()] = deck[i];
            qu.add(qu.poll());
        }
        return ans;
    }
}