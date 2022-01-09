/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next == null)
            return null;
        ListNode turtle = head;
        ListNode rabbit = head;
        turtle = turtle.next;
        rabbit = rabbit.next.next;
        while(turtle!=null && rabbit!=null && rabbit.next!=null)
        {
            if(turtle == rabbit)
                break;
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        if(turtle != rabbit)
            return null;
        turtle = head;
        while(turtle != rabbit)
        {
            turtle = turtle.next;
            rabbit = rabbit.next;
        }
        return turtle;
    }
}