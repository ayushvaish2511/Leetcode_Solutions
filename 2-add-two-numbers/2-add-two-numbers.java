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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int carry = 0;
        ListNode ans = new ListNode();
        ListNode head = ans;
        ListNode temp = head;
        while(l1!=null && l2!=null)
        {
                int sum = l1.val+l2.val+carry;
                carry = sum/10;
                l1.val = sum%10;
                ListNode p = new ListNode(sum%10);
                temp.next = p;
                l1 = l1.next;
                l2 = l2.next;
                temp = temp.next;
        }
        while(l2!=null)
            {
                int sum = carry+l2.val;
                ListNode p = new ListNode(sum%10);
                carry = sum/10;
                temp.next = p;
                temp = temp.next;
                l2 = l2.next;
            }
        while(l1!=null)
            {
                int sum = carry+l1.val;
                ListNode p = new ListNode(sum%10);
                carry = sum/10;
                temp.next = p;
                temp = temp.next;
                l1 = l1.next;
            }
        
        if(carry != 0)
        {
            ListNode p = new ListNode(carry);
            temp.next = p;
        }
        return head.next;
    }
}