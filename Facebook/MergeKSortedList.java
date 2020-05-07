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
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> (a.val - b.val));
        for(ListNode head:lists)
        {
            if(head!=null)
            {
                pq.add(head);
               
            }
        }
        if(pq.size() == 0)
            return null;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(pq.size()>0)
        {
            ListNode next = pq.poll();
            curr.next = next;
            curr = next;
            if(next.next!=null)
                pq.add(next.next);
        }
        return head.next;
    }
}
