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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return true;
        return isSymmetricUtil(root,root);
    }
    public boolean isSymmetricUtil(TreeNode left, TreeNode right)
    {   if(left == null && right == null)
        return true;
        if(left == null || right == null)
            return false;
        if(left.val == right.val && isSymmetricUtil(left.left,right.right) && isSymmetricUtil(left.right,right.left))
            return true;
        return false;
    }   
}
