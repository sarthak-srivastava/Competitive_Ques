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
     * @param root: a root of binary tree
     * @return: return a integer
     */
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + Integer.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // write your code here
        if(root == null)
        return 0;
        if(root.left ==null && root.right == null)
            return 0;

        return Integer.max(height(root.left) + height(root.right), Integer.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
}
