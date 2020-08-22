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
    public int sumNumbers(TreeNode A) {
        int sum = helper(A, 0);
        return sum % 1003;
    }
    public int helper(TreeNode A, int curr)
    {
        if(A == null)
            return 0;
        curr = ((curr * 10)%1003 + A.val%1003)%1003;
        if(A.left == null && A.right == null)
            return curr;
        return (helper(A.left, curr)%1003 + helper(A.right, curr)%1003 )%1003; 
        
    }
}
