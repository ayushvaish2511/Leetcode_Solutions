class Solution {
    class Pair{
        String word;
        int count;
        Pair(String w, int c)
        {
            word = w;
            count = c;
        }
    }
    public int diff(String a, String b)
    {
        int c = 0;
        for(int i = 0; i<a.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
            {
                c++;
                if(c > 1)
                {
                    return c;
                }
            }
        }
        return c;
    }
    public int minMutation(String start, String end, String[] bank) 
    {
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(start, 0));
        int n = bank.length;
        boolean[] visited = new boolean[n];
        while(!qu.isEmpty())
        {
            Pair p = qu.poll();
            String w = p.word;
            int c = p.count;
            if(end.equals(w))
            {
                return c;
            }
            for(int i = 0; i<n; i++)
            {
                if(!visited[i] && diff(w, bank[i]) == 1)
                {
                    qu.add(new Pair(bank[i], c+1));
                    visited[i] = true;
                }
            }
        }
        return -1;
    }
}