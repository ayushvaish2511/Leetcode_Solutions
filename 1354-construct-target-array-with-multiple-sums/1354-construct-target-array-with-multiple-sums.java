class Solution {
    public boolean isPossible(int[] target) 
    {
        if(target.length == 1) 
            return target[0] == 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for (int e: target) 
        {
            pq.add(e);
            sum += e;
        }

        while (pq.peek() != 1) 
        {
            int curr = pq.poll();
            if (sum - curr == 1) 
                return true;

            int x = curr % (sum - curr);
            sum = sum - curr + x;

            if (x == 0 || x == curr) 
                return false;
            else 
                pq.add(x);
        }

        return true;
        // Arrays.sort(target);
        // while(target[n-1] > 1 && target[0] >= 1)
        // {
        //     target[n-1] -= sum(target);
        //     Arrays.sort(target);
        // }
        // for(int i = 0; i<n; i++)
        // {
        //     if(target[i] != 1)
        //         return false;
        // }
        // return true;
    }
}