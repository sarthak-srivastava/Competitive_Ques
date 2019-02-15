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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return ans;
        q.add(root);
        q.add(null);
        List<Integer> curr = new ArrayList<Integer>();
        while(q.size()!=0)
        {
            TreeNode t = q.remove();
            
            if(t == null && q.peek()==null)
            {
             ans.add(0,curr);
                break;
            }
            if(t == null)
            {
                ans.add(0,curr);
                curr = new ArrayList<Integer>();
                q.add(null);
                continue;
            }
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);
            curr.add(t.val);
        }
        return ans;
    }
}
