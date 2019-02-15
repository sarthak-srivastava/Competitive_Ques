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
        if(root.left == null && root.right!=null)
            return 1+minDepth(root.right);
        
        if(root.left != null && root.right ==null)
            return 1+minDepth(root.left);
        else
            return 1+Integer.min(minDepth(root.left),minDepth(root.right));
    }
}
