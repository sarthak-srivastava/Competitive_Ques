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
        if(nums == null || nums.length == 0)
            return null;
        TreeNode root = new TreeNode(nums[nums.length/2]);
        root.left = sortedArrayToBST(nums, 0, nums.length/2 - 1);
        root.right = sortedArrayToBST(nums, nums.length/2 + 1, nums.length);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums, int left, int right)
    {   if(left > right || right < 0 || left >= nums.length)
            return null;
        if(left == right)
            return new TreeNode(nums[left]);
        
        TreeNode root = new TreeNode(nums[left + (right - left)/2]);
        root.left = sortedArrayToBST(nums, left, left + (right - left)/2 - 1);
        root.right = sortedArrayToBST(nums, left + (right - left)/2 + 1, right);
        return root;
    }
}
