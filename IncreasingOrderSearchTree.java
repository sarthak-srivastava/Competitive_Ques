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
    static TreeNode t = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode r= t;
        increasingBSTUtil(root);
        return r.right; 
        
    }
    public void increasingBSTUtil(TreeNode root)
    {   if(root == null)
        return;
        increasingBSTUtil(root.left);
        t.right = new TreeNode(root.val);
        t = t.right;
        increasingBSTUtil(root.right);
    }
}
