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
    static int sum = 0;
    public int sumOfLeftLeaves(TreeNode node) {
        int res = 0; 
   
        // Update result if root is not NULL 
        if (node != null)  
        { 
            // If left of root is NULL, then add key of 
            // left child 
            if (isLeaf(node.left)) 
                res += node.left.val; 
            else // Else recur for left child of root 
                res += sumOfLeftLeaves(node.left); 
   
            // Recur for right child of root and update res 
            res += sumOfLeftLeaves(node.right); 
        } 
   
        // return result 
        return res; 
    }
    public boolean isLeaf(TreeNode node)
    {
        if(node == null)
            return false;
        return (node.left == null && node.right == null);
    }
}
