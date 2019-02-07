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
    public int minDepth(TreeNode root) {
        if (root == null) 
            return 0; 
  
        // Base case : Leaf Node. This accounts for height = 1. 
        if (root.left == null && root.right == null) 
            return 1; 
  
        // If left subtree is NULL, recur for right subtree 
        if (root.left == null) 
            return minDepth(root.right) + 1; 
  
        // If right subtree is NULL, recur for left subtree 
        if (root.right == null) 
            return minDepth(root.left) + 1; 
  
        return Math.min(minDepth(root.left), 
                        minDepth(root.right)) + 1; 
    }
}
