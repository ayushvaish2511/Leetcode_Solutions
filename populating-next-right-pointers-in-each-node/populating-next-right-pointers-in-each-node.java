/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) 
    {
        if(root==null)
            return null;
        Queue<Node> qu = new LinkedList<>();
        Node ans = root;
        qu.add(root);
        qu.add(null);
        while(!qu.isEmpty())
        {
            Node p = qu.poll();
            if(p!=null)
            {
                p.next = qu.peek();
                if(p.left != null)
                    qu.add(p.left);
                if(p.right != null)
                    qu.add(p.right);
            }
            else if(!qu.isEmpty())
            {
                qu.add(null);
            }
        }
        return ans;
    }
}