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
    public boolean hasCycle(ListNode head) 
    {
        ListNode turtle = head;
        ListNode rabbit = head;
        int flag = 0;
        while(turtle!=null && rabbit!=null && rabbit.next!=null)
        {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if(turtle == rabbit)
            {
                return true;
            }
        }
        return false;
    }
}