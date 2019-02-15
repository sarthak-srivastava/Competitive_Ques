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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = BSTcreator(nums,0,nums.length-1);
        return root;
    }
    public static TreeNode BSTcreator(int[] nums,int start, int end)
    {
        int mid = (start+end)/2;
        if(start>end)
            return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BSTcreator(nums,start,mid-1);
        root.right = BSTcreator(nums,mid+1,end);
        return root;
    }
}
