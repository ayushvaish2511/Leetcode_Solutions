class MyLinkedList {
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }
    Node head;
    int length;
    
    public MyLinkedList() 
    {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) 
    {
        Node temp = head;
        int c = 0;
        while(temp!=null)
        {
            if(c==index)
                return temp.val;
            temp = temp.next;
            c++;
        }
        return -1;
    }
    
    public void addAtHead(int val) 
    {
        Node a = new Node(val);
        a.next = head;
        head = a;
        this.length++;
    }
    
    public void addAtTail(int val) 
    {
        
        Node a = new Node(val);
        a.next = null;
        Node temp = head;
        if(this.length == 0)
        {
            head = a;
            this.length++;
            return;
        }
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = a;
        this.length++;
    }
    
    public void addAtIndex(int index, int val) 
    {
        if(index < 0 || index > length)
            return;
        else if(index == 0)
            addAtHead(val);
        else if(index == this.length)
            addAtTail(val);
        else
        {
            Node a = new Node(val);
            int i = 0;
            Node temp = head;
            while(i!=index-1)
            {
                temp = temp.next;
                i++;
            }
            a.next = temp.next;
            temp.next = a;
            this.length++;
        }        
    }
    
    public void deleteAtIndex(int index) 
    {
        if(index < 0 || index >= length)
            return;
        else if(index == 0)
            head = head.next;
        else
        {
            Node temp = head;
            int i = 0;
            Node pre = null;
            while(i!=index)
            {
                pre = temp;
                temp = temp.next;
                i++;
            }
            pre.next = temp.next;
        }
        this.length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */