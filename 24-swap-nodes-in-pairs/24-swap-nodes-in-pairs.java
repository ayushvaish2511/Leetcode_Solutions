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
    public ListNode swapPairs(ListNode head) {
        return Swap(head);        
    }
    
    public static ListNode Swap(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode third = head.next.next;
        ListNode second = head.next;
        second.next = head;
        head.next = Swap(third);
        return second;
    }
}