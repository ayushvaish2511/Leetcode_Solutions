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
    public boolean isPalindrome(ListNode head) 
    {
        ArrayList<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            ll.add(temp.val);
            temp = temp.next;
        }
        int i = 0, j = ll.size()-1;
        while(i<=j)
        {
            if(ll.get(i)!=ll.get(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}















