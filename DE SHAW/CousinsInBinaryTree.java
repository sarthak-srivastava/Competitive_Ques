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
    ArrayList<Integer> ans;
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ans = new ArrayList<>();
        
        int level = getLevel(A, B, 1);
        printGivenLevel(A,B, level);
        
        return ans;
        
    }
    
    void printGivenLevel(TreeNode root, int node, int level)  
    {  
        // Base cases  
        if (root == null || level < 2)  
            return;  
      
        // If current node is parent of a node with  
        // given level  
        if (level == 2)  
        {  
            if ((root.left != null && root.left.val == node) || (root.right != null && root.right.val == node))  
                return;  
            if (root.left != null)  
                ans.add(root.left.val);
            if (root.right != null)  
                ans.add(root.right.val);
        }  
      
        else if (level > 2)  
        {  
            printGivenLevel(root.left, node, level-1);  
            printGivenLevel(root.right, node, level-1);  
        }  
    }
    
    
    int getLevel(TreeNode root, int node, int level)  
    {  
        if (root == null)  
            return 0;  
        if (root.val == node)  
            return level;  
      
        int downlevel = getLevel(root.left, node, level+1);  
        if (downlevel != 0)  
            return downlevel;  
      
        return getLevel(root.right, node, level+1);  
    }
}
