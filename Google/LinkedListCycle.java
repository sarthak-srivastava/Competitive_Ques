/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/**
* Initialize a leader pointer that travels two nodes at once.
* Initialize a follower pointer that travels a single node at once.
* while leader.next!=null && leader.next.next!=null, make leader = *leader.next.next and follower = follower.next;
* if leader == follower, return true
* outside the loop return false
**/ 

public class Solution {
    public boolean hasCycle(ListNode head) {
    ListNode lead = head;
    ListNode follow = head;
    if(head == null)
        return false;
    while(lead.next!=null && lead.next.next!=null)
    {
        lead = lead.next.next;
        follow = follow.next;
        if(follow == lead)
            return true;
    }
        return false;
    }
    
}
