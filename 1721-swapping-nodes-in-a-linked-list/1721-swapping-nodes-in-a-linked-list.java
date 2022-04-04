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
import java.util.Collections;
class Solution {
    public ListNode swapNodes(ListNode head, int k) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head = head.next;
        }
        int l = arr.size();
        Collections.swap(arr, k-1, l-k);
        ListNode ans = new ListNode();
        ListNode temp = ans;
        for(int i = 0; i<l; i++)
        {
            ListNode ptr = new ListNode(arr.get(i));
            temp.next = ptr;
            temp = temp.next;
        }
        return ans.next;
    }
}