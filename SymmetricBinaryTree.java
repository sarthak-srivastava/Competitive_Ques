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
    public int isSymmetric(TreeNode A) {
        return isMirror(A,A);
    }
    public int isMirror(TreeNode A, TreeNode B)
    {
        if(A==null && B == null)
        return 1;
        if(A!=null && B!=null && A.val == B.val)
        return isMirror(A.left,B.right)*isMirror(A.right,B.left);
        return 0;
    }
}
