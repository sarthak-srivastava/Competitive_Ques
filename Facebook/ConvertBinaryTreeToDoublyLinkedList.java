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
     * @param root: root of a tree
     * @return: head node of a doubly linked list
     */
    List<TreeNode> sorted;
    public TreeNode treeToDoublyList(TreeNode root) {
        // Write your code here.
        sorted = new ArrayList<TreeNode>();
        inOrder(root);
        for(int i = 0; i<sorted.size(); i++)
        {
            sorted.get(i).right = sorted.get((i + 1)%sorted.size());
            sorted.get((i + 1)%sorted.size()).left = sorted.get(i);
        }
        return sorted.get(0);
    }
    private void inOrder(TreeNode root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        sorted.add(new TreeNode(root.val));
        inOrder(root.right);
    }
}
