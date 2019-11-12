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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return -1;
        List<Integer> ans = new ArrayList<Integer>();
        kthSmallest(root, k ,ans);
        return ans.get(k - 1);
    }
    private void kthSmallest(TreeNode root, int k, List<Integer> ans)
    {
        if(root == null || k == 0)
            return;
        if(ans.size() == k)
            return;
        kthSmallest(root.left,k,ans);
        ans.add(root.val);
        kthSmallest(root.right, k, ans);
        
    }
}
