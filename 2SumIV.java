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
      Set<Integer> set = new HashSet<>();
    
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (findTarget(root.left, k)) return true;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        if (findTarget(root.right, k)) return true;
        
        return false;
    }
    
}
