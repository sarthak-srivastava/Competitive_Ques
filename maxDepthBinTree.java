/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode A) {
        return maxDepthUtil(A);
    }
    public int maxDepthUtil(TreeNode A)
    {
        if(A == null)
        return 0;
        return (1+Integer.max(maxDepthUtil(A.left),maxDepthUtil(A.right)));
    }
}
