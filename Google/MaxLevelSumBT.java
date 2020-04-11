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
    public int maxLevelSum(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int sum = root.val;
        int level = 1;
        int curr_level = 1;
        int temp = 0;
        while(!queue.isEmpty())
        {
         TreeNode curr = queue.poll();
            if(curr == null)
            {
                if(temp > sum)
                { sum = temp;
                level = curr_level;
                }
                 temp = 0;
                if(queue.peek() == null)
                    break;
                queue.add(null);
                curr_level++;
                continue;
            }
            if(curr.left!=null)
            {    queue.add(curr.left);
            
            }
            if(curr.right!=null)
                queue.add(curr.right);
            temp += curr.val;
        }
        return level;
    }
}
