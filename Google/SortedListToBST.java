/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);
        HashMap<Integer,ListNode> hm = new HashMap<>();
        ListNode tmp = head;
        int count = 0;
        while(tmp!=null)
        {
            hm.put(count,tmp);
            count++;
            tmp = tmp.next;
        }
        
        return constructBSTRecursion(head,hm,0,count - 1);
    }
    private TreeNode constructBSTRecursion(ListNode head, HashMap<Integer,ListNode> hm,int start, int end)
    {
        if(start>end)
            return null;
        int mid = start + (end - start)/2;
        ListNode midnode = hm.get(mid);
        TreeNode curr = new TreeNode(midnode.val);
        curr.left = constructBSTRecursion(midnode,hm,start,mid - 1);
        curr.right = constructBSTRecursion(midnode,hm,mid+1,end);
        return curr;
}
}
