/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode prev = header;
        ListNode curr = head;
        ListNode next = head.next;
        while(curr != null) {
            if (next != null && curr.val == next.val) {
                while(next != null && curr.val == next.val) {
                next = next.next;
                }
                prev.next = next;
                curr = next;
            }
            else {
                prev = prev.next;
                curr = curr.next;
            }
            if(next != null)
                next = next.next;
        }
        return header.next;
    }
}
