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
    public ListNode rotateRight(ListNode head, int k) 
    {
        //Connecting the last node to the head making it a cycle
        if(head == null || k==0)
            return head;
        ListNode temp = head;
        int c = 1;
        while(temp.next!=null)
        {
            temp = temp.next;
            c++;
        }
        temp.next = head;       
        //Rotating it 
        k = k%c;
        for(int i = 0; i<c-k; i++)
        {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}