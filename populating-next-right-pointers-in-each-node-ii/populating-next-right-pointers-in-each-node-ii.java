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
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while(!qu.isEmpty())
        {
            Node temp = qu.poll();
            if(temp != null)
            {
                temp.next = qu.peek();
                if(temp.left!=null)
                    qu.add(temp.left);
                if(temp.right!=null)
                    qu.add(temp.right);
            }
            else if(!qu.isEmpty())
                qu.add(null);
        }
        return root;
    }
}