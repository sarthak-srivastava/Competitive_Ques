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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<Integer>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while(qu.size()!=0)
        {
            TreeNode t = qu.remove();
            if(t == null && qu.peek() == null)
            {ans.add(new ArrayList<>(curr));
            return ans;}
            if(t == null)
            {
                ans.add(new ArrayList<>(curr));
                qu.add(null);
                curr = new ArrayList<Integer>();
            }
            else{
            if(t.left!=null)    
            qu.add(t.left);
            if(t.right!=null)
            qu.add(t.right);
            curr.add(t.val);}
            
        }
        return ans;
        
    }
}
