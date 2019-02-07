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
    HashSet<Integer> h = new HashSet<Integer>();
    public int t2Sum(TreeNode A, int B) {
        if(A == null)
        return 0;
        if(h.contains(B-A.val))
        return 1;
        // if(!h.contains(A.val))
        h.add(A.val);
        
        return Integer.max(t2Sum(A.left,B),t2Sum(A.right,B));
        
        
        
    }
}
