/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode newHead =  swapPairsHelper(head);
        return newHead;
    }
    public ListNode swapPairsHelper(ListNode head)
    {
         if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode curr_next = head.next;
        ListNode new_next = swapPairsHelper(curr_next.next);
        curr_next.next = curr;
        curr.next = new_next;
        return curr_next;
    }
}
