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
     * @param root1: the first tree
     * @param root2: the second tree
     * @return: returns whether the leaf sequence is the same
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // write your code here.
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        inOrder(root1, l1);
        inOrder(root2, l2);
        if(l1.size() != l2.size())
            return false;
        for(int i = 0; i<l1.size(); i++)
        {
            if(l1.get(i) != l2.get(i))
                return false;
        }
            return true;
    }
    private void inOrder(TreeNode root, List<Integer> l)
    {
        if(root == null)
            return;
        inOrder(root.left, l);
        if(root.left == null && root.right == null)
        {l.add(root.val);
            return;
        }
        inOrder(root.right, l);
    }
}
