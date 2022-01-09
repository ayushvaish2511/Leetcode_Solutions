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

/*Using Two pointers : 

-> Initialize two pointers ptr1 and ptr2  at the head1 and  head2.
-> Traverse through the lists,one node at a time.
-> When ptr1 reaches the end of a list, then redirect it to the head2.
-> Similarly when ptr2 reaches the end of a list, redirect it the head1.
-> Once both of them go through reassigning, they will be equidistant from the collision point
-> If at any node ptr1 meets ptr2, then it is the intersection node.
-> After second iteration if there is no intersection node it returns NULL.
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode a = headA;
        ListNode b = headB;
        if(a==null || b==null)
            return null;
        while(a!=b)
        {
            a = a.next;
            b = b.next;
            if(a==b)
                return a;
            if(a==null)
                a = headB;
            if(b==null)
                b = headA;            
        }
        return a;
    }
}