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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        populate(root1,l1);
        populate(root2,l2);
        // System.out.println(l1);
        // System.out.println(l2);
        if(l1.size()!=l2.size())
            return false;
        if(!l1.equals(l2))
            return false;
        return true;
            
        
    }
    public void populate(TreeNode root,ArrayList<Integer> l)
    {   if(root == null)
        return;
        
     populate(root.left,l);
     if(root.left==null && root.right==null)
     { l.add(root.val);
      
     
            
    }
     populate(root.right,l);
}
}
