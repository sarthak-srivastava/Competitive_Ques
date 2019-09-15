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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> q = new Stack<>();
        Stack<TreeNode> stk  = new Stack<>();
        q.add(root);
        int flag = 0;
        ArrayList<Integer> curr = new ArrayList<Integer>();
        curr = new ArrayList<Integer>();
        while(q.size()>0 || stk.size()>0)
        {
            if (flag == 0)
            {
                
                
                if(q.size() == 0)
                {
                    flag = 1;
                    ans.add(curr);
                    curr = new ArrayList<Integer>();
                    continue;
                }
                TreeNode t = q.pop();
                curr.add(t.val);
                if(t.left!=null)
                    stk.push(t.left);
                if(t.right!=null)
                    stk.push(t.right);
            }
            else
            {
               
                
                if(stk.size() == 0)
                {
                   
                    flag = 0;
                    ans.add(curr);
                    curr = new ArrayList<Integer>();
                    continue;
                }
                 TreeNode t = stk.pop();
                curr.add(t.val);
             
                if(t.right!=null)
                    q.push(t.right);
                  if(t.left!=null)
                    q.push(t.left);
            }
        }
        ans.add(curr);
        return ans;
    }
}
