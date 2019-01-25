/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy = new ListNode(0); 
  
        /* dummy node points to the original head*/
        dummy.next = head; 
        ListNode prev = dummy; 
        ListNode current = head; 
  
        while (current != null) 
        { 
            /* Until the current and previous values 
               are same, keep updating current */
            while (current.next != null && 
                   prev.next.val == current.next.val) 
                current = current.next; 
  
            /* if current has unique value i.e current 
                is not updated, Move the prev pointer 
                to next node*/
            if (prev.next == current) 
                prev = prev.next; 
  
            /* when current is updated to the last 
               duplicate value of that segment, make 
               prev the next of current*/
            else
                prev.next = current.next; 
  
            current = current.next; 
        } 
  
        /* update original head to the next of dummy 
           node */
        head = dummy.next; 
        return head;
    }
}
