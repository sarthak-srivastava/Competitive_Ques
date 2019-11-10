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
    public List<Integer> rightSideView(TreeNode root) {
     List<Integer> ans = new ArrayList<Integer>();
        if(root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>0)
        {
            TreeNode temp = queue.peek();
            queue.remove();
            if(temp == null && queue.peek() == null)
                break;
            if(temp == null)
            {
                queue.add(null);
                continue;
            }
            if(queue.peek() == null)
            {
                ans.add(temp.val);
                
            }
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return ans;
    }
}
