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
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode rabbit = head;
        while(rabbit!=null && turtle!=null && rabbit.next!=null)
        {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if(rabbit == turtle)
                return true;
        }
        return false;        
    }
}