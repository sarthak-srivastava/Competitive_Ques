/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
 - Create a BST checking function
 - Inorder Traversal and BST check.
 - If current node BST positive, calculate sum.
 - Compare sum with global answer.
 - return ans. Tada!!
*/
class Solution {
    int ans = 0;
    int sum = 0;
    public int maxSumBST(TreeNode root) {
        ans = 0;
        inOrderTraversal(root);
        return ans;
    }
    public void inOrderTraversal(TreeNode root)
    {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        sum = 0;
        if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
        ans = Integer.max(ans, sum);
        inOrderTraversal(root.right);
    }
    public boolean isBST(TreeNode root, int min_lim, int max_lim)
    {   if(root == null)
            return true;
        if(root.val<= min_lim || root.val>= max_lim)
            return false;
        sum += root.val;
        return isBST(root.left, min_lim, root.val) && isBST(root.right, root.val, max_lim);
    }
}
