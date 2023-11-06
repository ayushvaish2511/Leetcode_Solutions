class SeatManager {
    PriorityQueue<Integer> pq;
    int n;
    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        this.n = n;
        for(int i = n; i>=1; i--)
        {
            pq.add(i);
        }
    }
    
    public int reserve() {
        return pq.poll();
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */