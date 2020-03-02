/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        head.next = new ListNode(l1.val + l2.val);
        ListNode curr = head.next;
        l1 = l1.next;
        l2 = l2.next;
        carry = curr.val/10;
        curr.val = curr.val%10;
        while(l1!=null && l2!=null)
        {
            curr.next = new ListNode(carry + l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
            carry = curr.val/10;
            curr.val = curr.val%10;
        }
        while(l1!=null)
        {
            curr.next = new ListNode(carry + l1.val);
            l1 = l1.next;
            
            curr = curr.next;
            carry = curr.val/10;
            curr.val = curr.val%10;
        }
        while(l2!=null)
        {
            curr.next = new ListNode(carry + l2.val);
            l2 = l2.next;
            
            curr = curr.next;
            carry = curr.val/10;
            curr.val = curr.val%10;
        }
        if(carry > 0)
            curr.next = new ListNode(carry);
        return head.next;
    }
}
