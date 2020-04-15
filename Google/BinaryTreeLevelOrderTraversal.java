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
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> curr_list = new ArrayList<Integer>();
        while(queue.size() > 0)
        {
            TreeNode curr = queue.poll();
            if(curr == null)
            {
                ans.add(curr_list);
                curr_list = new ArrayList<Integer>();
                if(queue.peek() == null)
                    return ans;
                queue.add(null);
                continue;
            }    
            curr_list.add(curr.val);
            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);
        }
        return ans;
    }
}
