/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode oddhead = new ListNode(0);
        ListNode oddpointer = head;
        oddhead.next = oddpointer;
        ListNode evenhead = new ListNode(0);
        ListNode evenpointer = head.next;
        evenhead.next = evenpointer;
       
        while(evenpointer!=null && evenpointer.next!=null )
        {   oddpointer.next = evenpointer.next;
            oddpointer = oddpointer.next;
            evenpointer.next = oddpointer.next;
            evenpointer = evenpointer.next;
        }
        oddpointer.next = evenhead.next;
        return oddhead.next;
    }
}
