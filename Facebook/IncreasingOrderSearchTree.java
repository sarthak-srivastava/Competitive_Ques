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
     * @param root: a binary search tree
     * @return: Root of a tree
     */
     TreeNode ans  = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        // Write your code here.
        // in order traversal of BST will give me the smallest left most element
        ans = new TreeNode(0);
        TreeNode ret = ans;
        Util(root);
        return ret.right;
    }
    public void Util(TreeNode root)
    {
        if(root == null )
        return;
        Util(root.left);
        ans.right = new TreeNode(root.val);
        ans = ans.right;
        Util(root.right);
    }
}
