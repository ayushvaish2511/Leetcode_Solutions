/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        if(head == null)
            return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node ans = null;
        Node last = ans;
        Node temp = head;
        while(head != null)
        {
            Node p = new Node(head.val);
            map.put(head, p);
            if(ans == null)
            {
                ans = p;
                last = p;
            }
            else 
            {
                last.next = p;
                last = last.next;
            }
            head = head.next;
        }
        last = ans;
        while(last!=null)
        {
            Node p = map.get(temp.random);
            last.random = p;
            last = last.next;
            temp = temp.next;
        }
        return ans;
    }
}