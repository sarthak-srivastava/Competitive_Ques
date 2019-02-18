class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null ) return true;
        
       return  helper(root, null, null);
    }
    public static boolean helper(TreeNode root, Integer max, Integer min){
        if(root == null) return true;
        if(max!= null && root.val >= max) return false;
        if(min != null && root.val<= min) return false; 
        boolean left = helper(root.left, root.val, min);
        boolean right = helper(root.right, max, root.val);
        if(left != true || right != true) return false;
        return true;
    }
}
