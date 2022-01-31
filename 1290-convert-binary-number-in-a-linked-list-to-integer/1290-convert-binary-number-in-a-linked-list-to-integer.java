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
    public int getDecimalValue(ListNode head) 
    {
        int c = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        int ans = 0;
        temp = head;
        while(temp!=null)
        {
            ans += (int)Math.pow(2, c-1) * temp.val;
            temp = temp.next;
            c--;
        }
        return ans;
    }
}