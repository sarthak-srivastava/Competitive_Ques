/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        List<Integer> tmp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(queue.size() > 0)
        {
            TreeNode curr = queue.poll();
            if(curr == null)
            {
                
                ans.add(tmp);
                tmp = new ArrayList<>();
                if(queue.peek() == null)
                    break;
                queue.offer(null);
                continue;
            }
            if(curr.left != null)
            queue.offer(curr.left);
            if(curr.right != null)
            queue.offer(curr.right);
            tmp.add(curr.val);
        }
        return ans;
    }
}
