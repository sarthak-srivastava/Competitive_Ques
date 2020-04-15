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
    public int minDepth(TreeNode root) {
    if(root == null)
        return 0;
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
            while(q.size() > 0)
            {
                int size = q.size();
                while(size > 0)
                {
                    TreeNode temp = q.poll();
                    if(temp.left == null && temp.right== null)
                        return level;
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    size--;
                }
                level++;
            }
        return level;
    }
}
