class CustomStack {
    int[] arr;
    int size;
    int top = -1;
    public CustomStack(int maxSize) 
    {
        arr = new int[maxSize];
        size = maxSize;
    }
    
    public void push(int x) 
    {
        if(top<size-1)
        {
            top++;
            arr[top] = x;
        }
    }
    
    public int pop() 
    {
        if(top==-1)
            return -1;
        return arr[top--];
    }
    
    public void increment(int k, int val) 
    {
        for(int i = 0; i<k && i<size; i++)
            arr[i] = arr[i] + val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */