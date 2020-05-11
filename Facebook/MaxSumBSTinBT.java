/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*
 - Create a BST checking function
 - Inorder Traversal and BST check.
 - If current node BST positive, calculate sum.
 - Compare sum with global answer.
 - return ans. Tada!!
*/
class Solution {
    int ans = 0;
    int sum = 0;
    class sumBST
    {
        boolean bst;
        int sum;
        sumBST(boolean a, int b)
        {
            bst = a;
            sum = b;
        }
    }
    HashMap<TreeNode, sumBST> hm;
    public int maxSumBST(TreeNode root) {
        ans = 0;
        hm = new HashMap<>();
        inOrderTraversal(root);
        return ans;
    }
    public void inOrderTraversal(TreeNode root)
    {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        sum = 0;
        if(hm.containsKey(root))
        {
            sumBST tmp = hm.get(root);
            if(tmp.bst)
                ans = Integer.max(ans, tmp.sum);
        }
        else{
        boolean t = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if(t)
        ans = Integer.max(ans, sum);
        sumBST tmp = new sumBST(t, sum);
        hm.put(root, tmp);}
        inOrderTraversal(root.right);
    }
    public boolean isBST(TreeNode root, int min_lim, int max_lim)
    {   if(root == null)
            return true;
        
        if(root.val<= min_lim || root.val>= max_lim)
            return false;
        if(hm.containsKey(root))
        {
            sumBST tmp = hm.get(root);
                sum += tmp.sum;
                return tmp.bst;
        
        }
        sum += root.val;
        return isBST(root.left, min_lim, root.val) && isBST(root.right, root.val, max_lim);
    }
}
