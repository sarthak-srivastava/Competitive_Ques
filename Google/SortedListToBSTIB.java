/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode a) {
        if(a == null)
            return null;
        if(a.next == null)
            return new TreeNode(a.val);
        ListNode fast = a;
        ListNode slow = a;
        ListNode prev = null;
        while(fast != null && fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        TreeNode curr = new TreeNode(slow.val);
        if(prev != null)
        prev.next = null;
        curr.left = sortedListToBST(a);
        curr.right = sortedListToBST(slow.next);
        return curr;
    }
}
