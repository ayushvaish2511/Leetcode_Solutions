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
        ListNode s = new ListNode();
        ListNode head = s;
        ListNode temp = head;
        int carry = 0;
        while(l1!=null && l2!=null)
        {
            int sum = l1.val + l2.val + carry;
            if(sum<=9)
            {
                ListNode ans = new ListNode(sum);
                temp.next = ans;
                carry = 0;
            }
            else 
            {
                ListNode ans = new ListNode(sum%10);
                temp.next = ans; 
                carry = sum/10;
            }
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            int sum = l1.val + carry;
            if(sum<=9)
            {
                ListNode ans = new ListNode(sum);
                temp.next = ans;
                carry = 0;
            }
            else 
            {
                ListNode ans = new ListNode(sum%10);
                temp.next = ans; 
                carry = sum/10;
            }
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null)
        {
            int sum = l2.val + carry;
            if(sum<=9)
            {
                ListNode ans = new ListNode(sum);
                temp.next = ans;
                carry = 0;
            }
            else 
            {
                ListNode ans = new ListNode(sum%10);
                temp.next = ans; 
                carry = sum/10;
            }
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry!=0)
        {
            ListNode ans = new ListNode(carry);
            temp.next = ans;
        }
        return head.next;
    }
}