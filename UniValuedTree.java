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
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isUnivalTree(root,val);
    }
    public boolean isUnivalTree(TreeNode root, int v)
    {
        if(root == null)
            return true;
        if(root.val!=v)
            return false;
        return isUnivalTree(root.left,v)&&isUnivalTree(root.right,v) ;
    }
}
