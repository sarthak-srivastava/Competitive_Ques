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
    public boolean isValidBST(TreeNode root) {
        boolean result = true;
        if(root==null){
            return result;
        }
        if(root.left!=null){
            result = result && validate(root.left,null,root.val);
        }
        if(root.right!=null){
            result = result && validate(root.right,root.val,null);
        }
        return result;
    }
    
    private boolean validate(TreeNode root,Integer min,Integer max){
        if(min!=null && root.val<=min){
            return false;
        }
        if(max!=null && root.val>=max){
            return false;
        }
        boolean result = true;
        if(root.left!=null){
            result = result && validate(root.left,min,root.val);
        }
        if(root.right!=null){
           result = result && validate(root.right,root.val,max);
        }
        return result;
    }

}
