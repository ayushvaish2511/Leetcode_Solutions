class MinStack {
    public class Pair{
        int val;
        int min;
        Pair(int val, int min)
        {
            this.val = val;
            this.min = min;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<Pair>();
    }
    
    public void push(int val) {
        if(st.empty())
        {
            Pair temp = new Pair(val, val);
            st.push(temp);
        }
        else 
        {
            Pair p = st.peek();
            int m = p.min < val ? p.min : val;
            Pair temp = new Pair(val, m);
            st.push(temp);
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */