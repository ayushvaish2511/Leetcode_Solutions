/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        int c = 0;
        while(a!=b)
        {
            if(a == b)
                return a;
            a = a.next;
            b = b.next;
            if(a == null)
            {
                c++;
                a = headB;
            }
            if(b == null)
            {
                c++;
                b = headA;
            }
            if(c>4)
                return null;
        }
        
        return a;        
    }
}