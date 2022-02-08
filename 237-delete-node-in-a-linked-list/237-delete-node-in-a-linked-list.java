/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        ListNode temp1 = node.next;
        node.val = temp1.val;
        node.next = temp1.next;
        temp1 = null;
    }
}