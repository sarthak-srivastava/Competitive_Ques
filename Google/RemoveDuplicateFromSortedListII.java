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
         if(head == null || head.next == null)
             return head;
        Map<Integer,Integer> hm = new HashMap<>();
        ListNode curr = head;
        while(curr != null)
        {
            hm.put(curr.val, hm.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        while(head!=null)
        {
            if(hm.get(head.val)>1)
                head = head.next;
            else
                break;
        }
        if(head == null)
            return head;
        curr = head;
        ListNode next = curr.next;
        while(curr!=null && next != null)
        {   next = curr.next;
            while(next!=null && hm.get(next.val) > 1)
                next = next.next;
            curr.next = next;
            curr = curr.next;
            
        }
        return head;
    }
}
