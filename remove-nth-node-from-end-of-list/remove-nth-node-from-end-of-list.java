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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        for(int i = 0; i<n; i++)
        {
            if(ptr2.next == null)
            {
                if(i==n-1)
                {
                    head = head.next;
                    return head;
                }
            }
            ptr2 = ptr2.next;
        }
        while(ptr2.next!=null)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr1.next.next;
        return head;
    }
}