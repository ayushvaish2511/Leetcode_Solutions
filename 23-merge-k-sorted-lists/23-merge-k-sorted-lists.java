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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> ((ListNode)a).val));
        for(int i = 0; i<lists.length; i++)
        {
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        ListNode head = null;
        ListNode ele = null;
        while(!pq.isEmpty())
        {
            ListNode min = pq.poll();
            
            if(head == null)
            {
                head = min;
                ele = min;
            }
            else 
            {
                ele.next = min;
                ele = min;
            }
            if(min.next!=null)
            {
                pq.add(min.next);
            }
        }
        return head;
    }
}