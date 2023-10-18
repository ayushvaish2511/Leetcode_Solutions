class LRUCache {
    public class Node{
        Node prev, next;
        int key;
        int value;
        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    } 
    HashMap<Integer, Node> map;
    int capacity;
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node p = map.get(key);
            remove(p);
            insert(p);
            return p.value;
        }
        return -1;
    }
    
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
        {
            Node p = map.get(key);
            remove(p);
        }
        if(map.size() == capacity)
        {
            remove(tail.prev);
        }
        Node temp = new Node(key, value);
        insert(temp);
    }
    
    public void insert(Node p)
    {
        map.put(p.key, p);
        p.next = head.next;
        p.next.prev = p;
        p.prev = head;
        head.next = p;
    }
    
    public void remove(Node p)
    {
        map.remove(p.key);
        p.prev.next = p.next;
        p.next.prev = p.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */