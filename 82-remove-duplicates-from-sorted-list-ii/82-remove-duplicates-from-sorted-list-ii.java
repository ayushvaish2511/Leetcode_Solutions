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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while(curr!=null)
        {
            while(curr.next!=null && prev.next.val == curr.next.val)
                curr = curr.next;
            if(prev.next == curr)
                prev = prev.next;
            else 
            {
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}