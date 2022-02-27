/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) 
    {
        ListNode Turtle = head;
        ListNode Rabbit = head;
        while(Rabbit!=null && Turtle!=null)
        {
            if(Rabbit.next == null)
                return Turtle;
            else if(Rabbit.next.next == null)
                return Turtle.next;
            Turtle = Turtle.next;
            Rabbit = Rabbit.next.next;
        }
        return null;
    }
}