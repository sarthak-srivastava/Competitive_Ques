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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null)
            return ans;
        postOrderTraversal(root,ans);
        return ans;
    }
    private void postOrderTraversal(TreeNode root, List<Integer> ans)
    {
        if(root == null)
            return ;
        postOrderTraversal(root.left,ans);
        postOrderTraversal(root.right,ans);
        ans.add(root.val);
    }
}
