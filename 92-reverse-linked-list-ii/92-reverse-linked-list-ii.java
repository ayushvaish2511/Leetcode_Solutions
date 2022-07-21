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
    public ListNode reverseList(ListNode node)
    {
        
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        ListNode strt = null;
        ListNode strt_prev = null;
        ListNode curr = head;
        ListNode end = null;
        ListNode end_next = null;
        int i = 1;
        while(curr!=null && i<=right)
        {
            if(i < left)
                strt_prev = curr;
            if(i == left)
                strt = curr;
            if(i == right)
            {
                end = curr;
                end_next = curr.next;
            }
            curr = curr.next;
            i++;
        }
        end.next = null;
        end = reverseList(strt);
        if(strt_prev != null)
            strt_prev.next = end;
        else
            head = end;
        strt.next = end_next;
        return head;
    }
}