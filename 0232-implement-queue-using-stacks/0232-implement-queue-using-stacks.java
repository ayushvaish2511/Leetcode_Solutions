class MyQueue {
    Stack<Integer> ip;
    Stack<Integer> op;
    public MyQueue() {
        ip = new Stack<>();
        op = new Stack<>();
    }
    
    public void push(int x) {
        while(!ip.empty())
        {
            op.push(ip.peek());
            ip.pop();
        }
        ip.push(x);
        while(!op.empty())
        {
            ip.push(op.peek());
            op.pop();
        }
    }
    
    public int pop() {
        return ip.pop();
    }
    
    public int peek() {
        return ip.peek();
    }
    
    public boolean empty() {
        return ip.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */