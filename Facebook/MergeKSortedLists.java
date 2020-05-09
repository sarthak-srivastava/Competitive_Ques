/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        ListNode head = new ListNode(0);
        if(lists == null || lists.size() == 0)
            return head.next;
        ListNode curr = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> (a.val - b.val));
        for(ListNode temp : lists)
        {
            if(temp!=null)
             pq.offer(temp);
        }
        while(pq.size() > 0)
        {
            ListNode temp = pq.remove();
            curr.next = temp;
            curr = curr.next;
            if(temp.next != null)
                pq.offer(temp.next);
        }
        return head.next;
    }
}
