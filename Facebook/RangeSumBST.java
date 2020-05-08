/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: the root node
     * @param L: an integer
     * @param R: an integer
     * @return: the sum
     */
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        // write your code here.
        if(root == null)
            return 0;
        sum = 0;
        Util(root, L, R);
        return sum;
    }
    public void Util(TreeNode root, int L, int R)
    {
        if(root == null)
            return;
        if(root.val < L)
            Util(root.right, L ,R);
        else if (root.val > R)
            Util(root.left, L, R);
        else
        {
        sum += root.val;
        Util(root.left, L, R);
        Util(root.right, L , R);
    }
    }
}
