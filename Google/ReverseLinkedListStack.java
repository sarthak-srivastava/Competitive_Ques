/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        Stack<ListNode> stk = new Stack<>();
        while(head!=null){
            stk.push(head);
            head = head.next; 
        }
        head = stk.pop();
        ListNode curr =stk.pop();
        head.next = curr;
        while(stk.size() > 0)
        {
            curr.next = stk.pop();
            curr = curr.next;
        }
        curr.next = null;
        
        return head;
        
    }
}
