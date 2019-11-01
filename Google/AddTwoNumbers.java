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
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = new ListNode(0);
        ListNode start = new ListNode((l1.val+l2.val)%10);
        head.next = start;
        int carry = (l1.val+l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null && l2!=null)
        {
            start.next = new ListNode((l1.val+l2.val+carry)%10);
            
            carry = (l1.val+l2.val+carry)/10;
            
            start = start.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            start.next = new ListNode((l1.val+carry)%10);
            carry = (l1.val+carry)/10;
            start = start.next;
            l1 = l1.next;
            
        }
          while(l2!=null)
        {
            start.next = new ListNode((l2.val+carry)%10);
            carry = (l2.val+carry)/10;
            start = start.next;
            l2 = l2.next;
            
        }
        if(carry!=0)
            start.next = new ListNode(carry);
        return head.next;
        
    }
}
