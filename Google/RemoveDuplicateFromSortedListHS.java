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
        Set<Integer> hs = new HashSet<>();
        ListNode curr = head;
        while(curr!=null)
        {   hs.add(curr.val);
            ListNode next = curr.next;
            while(next!=null && hs.contains(next.val))
                next = next.next;
            
            curr.next = next;
            curr = next;
            
        }
        return head;
    }
}
