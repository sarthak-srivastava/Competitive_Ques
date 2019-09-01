/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode header = head;
        ListNode lead = head;
        ListNode tail = head;
        for(int i = 0; i<=n;i++)
        {
            try{
                lead = lead.next;}
            catch (Exception e)
            { return header.next;}
        }
        while(lead!=null)
        {
            lead = lead.next;
            tail = tail.next;
        }
        // if(tail == header)
        //     return header.next;
        if(tail.next == null)
            return header;
        
        tail.next = tail.next.next;
        return header;
    }
}
