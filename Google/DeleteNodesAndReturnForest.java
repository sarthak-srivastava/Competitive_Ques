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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(root == null)
            return ans;
        HashSet<Integer> hs = new HashSet<>();
        for(int i: to_delete)
            hs.add(i);
        if(!hs.contains(root.val))
            ans.add(root);
        delNodesHelper(root,hs,ans);
        return ans;
    }
    private TreeNode delNodesHelper(TreeNode root, HashSet<Integer> hs, List<TreeNode> ans)
    {   if(root.left!=null)
        root.left = delNodesHelper(root.left,hs,ans);
        if(root.right!=null)
        root.right = delNodesHelper(root.right,hs,ans);
        if(hs.contains(root.val))
        {
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else
            {
                if(root.left!=null)
                    ans.add(root.left);
                if(root.right!=null)
                    ans.add(root.right);
                root = null;
            }
        }
     return root;
    }
}
