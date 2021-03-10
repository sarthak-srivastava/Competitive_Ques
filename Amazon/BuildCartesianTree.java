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
    public TreeNode buildTree(ArrayList<Integer> A) {
        if(A == null || A.size() == 0)
            return null;
        return buildTree(A, 0, A.size());
    }
    public TreeNode buildTree(ArrayList<Integer> A, int i, int j)
    {
        if(i>=j)
            return null;
        // if(i == j)
        //     return new TreeNode(A.get(i));
        int max = i;
        for(int k = i + 1; k< j; k++)
        {
            if(A.get(k) > A.get(max))
                max = k;
        }
        TreeNode curr = new TreeNode(A.get(max));
        curr.left = buildTree(A,i,max);
        curr.right = buildTree(A, max + 1, j);
    
        return curr;
        
    }
}
