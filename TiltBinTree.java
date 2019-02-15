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
static int sum=0;
    public int findTilt(TreeNode root) {
        sum = 0;
        if(root==null){return 0;}
        findValue(root);
        return sum;
    }
    public int findValue(TreeNode root){
        if(root ==null){return 0;}
        int left =findValue(root.left);
        int right=findValue(root.right);
        sum=sum+Math.abs(left-right);
        
        return left+right+root.val;
    }
    
}
