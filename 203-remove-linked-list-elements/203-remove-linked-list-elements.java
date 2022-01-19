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
    public ListNode removeElements(ListNode head, int val) 
    {
        // if(head==null)
        //     return null;
        // while(head!=null && head.val != val)
        // {
        //     head = head.next;
        // }
        // ListNode temp = head;
        // ListNode prev = null;
        // while(temp!=null)
        // {
        //     while(temp!=null && temp.val!=val)
        //     {
        //         prev = temp;
        //         temp = temp.next;
        //     }
        //     if(temp == null)
        //     {
        //         return head;
        //     }
        //     prev.next = temp.next;
        //     temp = prev.next;
        // }
        // return head;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode curr = temp;
        while(curr.next!=null)
        {
            if(curr.next.val == val)
            {
                curr.next = curr.next.next;
            }
            else 
            {
                curr = curr.next;
            }
        }
        return temp.next;
    }
}